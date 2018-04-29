package com.jsf.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.xhtml" })
public class AuthorizationFilter implements Filter{
	public AuthorizationFilter() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {

			HttpServletRequest reqt = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpSession ses = reqt.getSession(false);

			String reqURI = reqt.getRequestURI();
			if (reqURI.indexOf("/index.xhtml") >= 0
					|| (ses != null && ses.getAttribute("user") != null)
					|| reqURI.indexOf("/pages/register.xhtml") >= 0
					|| reqURI.indexOf("/404.xhtml") >= 0
					|| reqURI.indexOf("/pages/confirmemail.xhtml") >= 0
					|| reqURI.contains("javax.faces.resource"))
				chain.doFilter(request, response);
			else
				resp.sendRedirect(reqt.getContextPath() + "/index.xhtml");
			if(reqURI.indexOf("/index.xhtml") >= 0 && (ses != null && ses.getAttribute("user") != null)){
				resp.sendRedirect(reqt.getContextPath() + "/pages/home.xhtml");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			HttpServletRequest reqt = (HttpServletRequest) request;
//			HttpServletResponse resp = (HttpServletResponse) response;
//			resp.sendRedirect(reqt.getContextPath() + "/404.xhtml");
		}
	}

	@Override
	public void destroy() {

	}
}