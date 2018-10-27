package com.jsftemplate.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsftemplate.bean.Header;

@ManagedBean
@SessionScoped
public class SessionContext implements Serializable{

	/**
	 * SessionContext Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private Header header;
	


	public Header getHeader() {
		if(header == null){
			header = new Header();
		}
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	

}
