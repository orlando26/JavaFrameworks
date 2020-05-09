package com.orlando.musicws.util;


public class StandardResponse<T> {
	
	public String status;
	
	public String responseText;
	
	public T entity;

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

	@Override
	public String toString() {
		return "StandardResponse [status=" + status + ", responseText=" + responseText + ", entity=" + entity + "]";
	}
	
}
