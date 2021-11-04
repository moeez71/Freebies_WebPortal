package uk.co.planetbeyond.service.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import uk.co.planetbeyond.service.managedbean.WebUserManagedBean;

/**
 * Servlet Filter implementation class UserSessionFilter
 */
public class UserSessionFilter implements Filter
{

	/**
	 * Default constructor.
	 */
	public UserSessionFilter()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy()
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest serveletRequest, ServletResponse serveletResponse, FilterChain filterChain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) serveletRequest;
		HttpServletResponse response = (HttpServletResponse) serveletResponse;

		// get the name of the page requested by the user
		String requestedPageUrl = request.getServletPath();

		if (requestedPageUrl.startsWith("/javax.faces.resource"))
		{
			filterChain.doFilter(serveletRequest, serveletResponse);
			return;
		}

		// get the page name, ie from /admin/dir/abc.faces => abc.faces will be returned
		requestedPageUrl = requestedPageUrl.substring(requestedPageUrl.lastIndexOf("/"));

		// remove any unwanted characters/strings from the start and end of the name of the requested page
		requestedPageUrl = StringUtils.trim(requestedPageUrl);
		requestedPageUrl = StringUtils.removeStart(requestedPageUrl, "/");
		requestedPageUrl = StringUtils.removeEnd(requestedPageUrl, "/");

		// Since the jsf pages names placed in our constants file do not contain the .faces extension so remove the .faces extension from the
		// requested page url here as well.
		requestedPageUrl = StringUtils.removeEnd(requestedPageUrl, ".faces");

		if (!new WebUserManagedBean().isAllowPage(requestedPageUrl, request) && !requestedPageUrl.equals("login"))
		{
			response.sendRedirect("login.faces");
			return;
		}

		filterChain.doFilter(serveletRequest, serveletResponse);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException
	{
		// TODO Auto-generated method stub
	}

}
