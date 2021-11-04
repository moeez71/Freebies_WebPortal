// ______________________________________________________
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: com.mysql.jdbc.Driver
//
// Author: Javed Kansi
// ______________________________________________________

package uk.co.planetbeyond.service.generated.util;

import org.slf4j.Logger;

public abstract class Processor<T>
{
	private Logger log;

	/**
	 * This value is used for logging
	 */
	protected String processName;
	protected Integer scheduledAutoRenewalJobId;

	public Processor(String processName, Logger log)
	{
		super();
		this.log = log;
		this.processName = processName;
		this.scheduledAutoRenewalJobId = null;
	}

	public Processor(String processName, int scheduledAutoRenewalJobId, Logger log)
	{
		super();
		this.log = log;
		this.processName = processName;
		this.scheduledAutoRenewalJobId = scheduledAutoRenewalJobId;
	}

	/**
	 * This is the main entry point in to this class. This function calls process.
	 */
	public void startProcess()
	{
		try
		{
			init();

			ProcessReturnValue retVal = process();

			if (retVal == ProcessReturnValue.COMPLETED_SUCCESSFULLY)
			{
				onComplete();
			}
			else if (retVal == ProcessReturnValue.SHUTDOWN_OCCURED)
			{
				onShutdown();
			}
			else
			{
				onProcessingException(retVal.getException());
			}
		}
		catch (Throwable e)
		{
			log.error(e.toString(), e);
		}
	}

	/**
	 * This method is called before the batch process is started. Child class can use this function for any kind of initialization it needs
	 */
	protected abstract void init();

	/**
	 * This function is called when the process completes successfully
	 */
	protected abstract void onComplete();

	/**
	 * This function is called when the process exception occured
	 * 
	 * @param throwable
	 */
	protected abstract void onProcessingException(Throwable throwable);

	/**
	 * This is the main function that contains the logic for processing
	 * 
	 * @param entry
	 * @throws Exception
	 */
	protected abstract ProcessReturnValue process() throws Exception;

	/**
	 * This function is called when the process is terminated by calling the shutdown() function
	 */
	protected abstract void onShutdown();

	public static enum ProcessReturnValue
	{
		SHUTDOWN_OCCURED, EXCEPTION_OCCURED, COMPLETED_SUCCESSFULLY;

		private Throwable exception;

		public Throwable getException()
		{
			return exception;
		}

		public void setException(Throwable exception)
		{
			this.exception = exception;
		}
	}
}
