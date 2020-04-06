package com.orlando.musicws.util;

public class StandardResponse<T> {
	
	private String status;
	
	private String responseText;
	
	private T entity;
	
	public StandardResponse(){
		
	}

	public StandardResponse(String status, String responseText, T entity) {
		super();
		this.status = status;
		this.responseText = responseText;
		this.entity = entity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	
	
	
}
