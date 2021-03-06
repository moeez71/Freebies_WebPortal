




// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.cache;

import java.util.HashMap;

import uk.co.planetbeyond.service.generated.exception.DAOException;
import uk.co.planetbeyond.service.generated.SubscriberStatsBean;
import uk.co.planetbeyond.service.manager.SubscriberStatsManagerImpl;

/**
 * This cache manager is based on code from Mark GRAND in "Patterns in Java,
 * Volume 1", Wiley.
 * 
 * @author afagot
 */
public final class SubscriberStatsCache 
{
	/**
	 * Unique instance of the cache manager.
	 */
	private static SubscriberStatsCache instance = new SubscriberStatsCache();

	/**
	 * Maximum number of SubscriberStatsBean objects that may be in the cache.
	 */
	private int maxCacheSize = 80;

	/**
	 * The number of SubscriberStatsBean objects currently in the cache.
	 */
	private int currentCacheSize = 0;

	/**
	 * We use a linked list to determine the least recently used bean. The cache
	 * is implemented by a HashMap object. The HashMap values are linked list
	 * objects that refer to the actual SubscriberStatsBean.
	 */
	private HashMap<Integer, LinkedList> cache = new HashMap<Integer, LinkedList>();

	/**
	 * This is the head of the linked list that refers to the most recently used
	 * SubscriberStatsBean.
	 */
	private LinkedList mru;

	/**
	 * This is the end of the linked list that refers to the least recently used
	 * SubscriberStatsBean.
	 */
	private LinkedList lru;
	
	/**
	* Object to make updates in this class sychronized
	*/
	private Object updateLock = new Object();
	
	/**
	 * In order to prevent the compiler from generating the default constructor.
	 */
	private SubscriberStatsCache() 
	{
	}

	/**
	* Max Number of entries that can be saved in the cache at a time
	*
	* @param maxCacheSize
	*/
	public void updateMaxCacheSize(int maxCacheSize)
	{
		this.maxCacheSize = maxCacheSize;
	}
	
	/**
	 * Return the unique instance of the class.
	 */
	public static SubscriberStatsCache getInstance() 
	{
		return instance;
	}

	/**
	 * A SubscriberStatsBean object is passed to this method for addition to the cache.
	 */
	public void addSubscriberStats(SubscriberStatsBean bean) 
	{
		synchronized(updateLock)
		{ 
			Integer id = bean.getSubscriberStatsId();
			if (null == cache.get(id)) 
			{
	
				// bean not in the cache
				// add bean to the cache, making it the most recently used
				if (0 == currentCacheSize) 
				{
					// treat empty cache as a special case
					lru = mru = new LinkedList();
					mru.bean = bean;
				} 
				else 
				{
					LinkedList newLink;
					if (maxCacheSize < currentCacheSize) 
					{
						// remove the least recently used bean from the cache
						newLink = lru;
						lru = newLink.previous;
						cache.remove(newLink.bean.getSubscriberStatsId());
						lru.next = null;
					} 
					else 
					{
						newLink = new LinkedList();
						currentCacheSize++;
					}
					newLink.bean = bean;
					newLink.next = mru;
					newLink.previous = null;
					mru = newLink;
				}
				// put the now most recently used bean in the cache
				cache.put(id, mru);		
			} 
			else 
			{ 
				// bean already in the cache
				// addBid should not be called when the object is already in the
				// cache however since that happened do a fetch so that the object
				// becomes the most recently used
				fetchSubscriberStats(id);
			}
		}
	}

	/**
	 * Return the SubscriberStatsBean associated with the given key.
	 */
	public SubscriberStatsBean fetchSubscriberStats(Integer id) 
	{
		LinkedList foundLink = (LinkedList) cache.get(id);
		if (null == foundLink) 
		{
			SubscriberStatsBean bean = null;
			try 
			{
				bean = SubscriberStatsManagerImpl.getInstance().loadByPrimaryKey(id);
			} 
			catch (DAOException e) 
			{
				return null;
			}
			if (null != bean) 
			{
				addSubscriberStats(bean);
			}
			return bean;
		}

		synchronized(updateLock)
		{
			// AFagot [2007-07-06]
			// this could be acheived with the now standard java.util.LinkedList and
			// java.util.ListIterator but the code was already written since 1998 ;-)
			if (mru != foundLink) 
			{
				if (null != foundLink.previous) 
				{
					foundLink.previous.next = foundLink.next;
				}
				if (null != foundLink.next) 
				{
					foundLink.next.previous = foundLink.previous;
				}
				foundLink.previous = null;
				foundLink.next = mru;
				mru = foundLink;
			}
		}

		return foundLink.bean;
	}

	/**
	 * Updates SubscriberStatsBean object in the cache.
	 */
	public void updateSubscriberStats(SubscriberStatsBean bean) 
	{
		synchronized(updateLock)
		{
			// check if the given object is present in the cache
			if (isSubscriberStatsInCache(bean))  
			{
				Integer id = bean.getSubscriberStatsId();			
			
				// if found, update it
				cache.get(id).bean = bean;
			}
			else
			{
				// addSubscriberStats(bean);
			}
		}
	}

	/**
	 * Removes all entries from the cache
	 */
	public void clearCache()
	{
		synchronized (updateLock)
		{
			cache.clear();
			currentCacheSize = 0;
			lru = mru = new LinkedList();
		}
	}

	/**
	 * Returns true if SubscriberStatsBean object is in the cache. FALSE otherwise
	 */
	public boolean isSubscriberStatsInCache(SubscriberStatsBean bean) 
	{
		Integer id = bean.getSubscriberStatsId();

		// check if the given object is present in the cache
		return cache.get(id) == null? false : true;
	}

	/**
	 * Private doubly linked list for managing list of most recently used beans.
	 */
	private class LinkedList 
	{
		SubscriberStatsBean bean;
		LinkedList previous;
		LinkedList next;
	}
}
