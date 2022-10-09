package com.example.cupon.utlity;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class LoggerInterceptor implements HandlerInterceptor{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MDC.put("appToken", request.getHeader("AppToken"));
		LOGGER.info("Adding appToken {}", MDC.get("apptoken"));

		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {

		LOGGER.info("befrore clear  token {}", MDC.get("apptoken"));
		MDC.clear();

	}
}
//@WebFilter( filterName = "loggerInterceptor", urlPatterns = { "/*" } )
//public class LoggerInterceptor implements Filter {
// 
//    @Override
//    public void destroy() {
//    }
// 
//  
// 
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		 MDC.put( "appToken", request.getParameter("AppToken") );
//		 
//	        try {
//	            chain.doFilter( request, response );
//	        } finally {
//	            MDC.clear();
//	        }
//	    }
//	 @Override
//	    public void init( final FilterConfig filterConfig ) 
//	    	throws ServletException {
//	    }
//	}
