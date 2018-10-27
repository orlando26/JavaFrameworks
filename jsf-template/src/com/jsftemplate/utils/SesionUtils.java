package com.jsftemplate.utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.orlando.ws.Person;

public class SesionUtils {
	
	public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}
	
	public static void setUserLogged(Person person) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("user", person);
	}
	
	public static Person getUser() {
		HttpSession session = getSession();
		return (Person)session.getAttribute("user");
	}
	
	public static void setUserToUpdate(Person person) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("userToUpdate", person);
	}
	
	public static Person getUserToUpdate() {
		HttpSession session = getSession();
		return (Person)session.getAttribute("userToUpdate");
	}
	
	public static boolean isValid() {
		if(getUser() == null) {
			return false;
		}
		return true;
	}
	
}
