package com.jsf.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.el.ELContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Gets the faces context
	 * @return FacesContext
	 */
	public FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance();
	}
	
	/**
	 * Gets the URL parameter
	 * 
	 * @param paramName
	 * 
	 * @return a string containing the parameter value
	 */
	public String getParam(String paramName){
		return getFacesContext().getExternalContext().getRequestParameterMap().get(paramName);
	}
	
	/**
	 * Gets the value of an EL expresion
	 * @param beanName
	 * @return The Object resulting from the expression evaluation
	 */
	public Object getValue(String beanName){
		ELContext el = getFacesContext().getELContext();
		Object o = el.getELResolver().getValue(el, null, beanName);
		if (o == null){
			throw new RuntimeException("The bean " + beanName + " was not found :(");
		}
		return o;
	}
	
	/**
	 * Gets the request object
	 * @return the request Object
	 */
	public HttpServletRequest getRequest(){
		return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	/**
	 * Gets the response object
	 * @return the response Object
	 */
	public HttpServletResponse getResponse(){
		return (HttpServletResponse) getFacesContext().getExternalContext().getResponse();
	}
	
	/**
	 * Performs a redirect to another page
	 * @param url
	 */
	public void redirect(String url){
		assert url != null;
		assert url.startsWith("/");
		
		FacesContext context = getFacesContext();
		context.responseComplete();
		HttpServletResponse response = getResponse();
		try{
			response.sendRedirect(response.encodeRedirectURL(getRequest().getContextPath() + url));
		}catch(IOException e){
			throw new RuntimeException(e);
		}	
	}
	
	protected Object getSessionBean(String bean){
		Object object = getFacesContext().getExternalContext().getSessionMap().get(bean);
		return object;
	}

}