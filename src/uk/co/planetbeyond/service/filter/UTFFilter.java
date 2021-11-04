package uk.co.planetbeyond.service.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UTFFilter implements Filter
{
	@Override
	public void destroy()
	{

	}

	@Override
	public void doFilter(ServletRequest serveletRequest, ServletResponse serveletResponse, FilterChain filterChain) throws IOException, ServletException
	{
		serveletRequest.setCharacterEncoding("UTF-8");
		filterChain.doFilter(serveletRequest, serveletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{

	}
}
