package com.jsf.utils;

import com.jaxws.ws.CreateUserService;
import com.jaxws.ws.CreateUserServiceImplService;
import com.jaxws.ws.DeleteUserService;
import com.jaxws.ws.DeleteUserServiceImplService;
import com.jaxws.ws.RetrieveCitiesService;
import com.jaxws.ws.RetrieveCitiesServiceImplService;
import com.jaxws.ws.RetrieveStatesService;
import com.jaxws.ws.RetrieveStatesServiceImplService;
import com.jaxws.ws.RetrieveUserService;
import com.jaxws.ws.RetrieveUserServiceImplService;

public class WebServices {
	
	CreateUserService createUserService;
	
	DeleteUserService deleteUserService;
	
	RetrieveUserService retrieveUserService;
	
	RetrieveStatesService retrieveStateService;
	
	RetrieveCitiesService retrieveCitiesService;

	public RetrieveStatesService getRetrieveStateService() {
		return new RetrieveStatesServiceImplService().getRetrieveStatesServiceImplPort();
	}

	public void setRetrieveStateService(RetrieveStatesService retrieveStateService) {
		this.retrieveStateService = retrieveStateService;
	}

	public RetrieveCitiesService getRetrieveCitiesService() {
		return new RetrieveCitiesServiceImplService().getRetrieveCitiesServiceImplPort();
	}

	public void setRetrieveCitiesService(RetrieveCitiesService retrieveCitiesService) {
		this.retrieveCitiesService = retrieveCitiesService;
	}

	/**
	 * @return the createUserService
	 */
	public CreateUserService getCreateUserService() {
		return new CreateUserServiceImplService().getCreateUserServiceImplPort();
	}

	/**
	 * @param createUserService the createUserService to set
	 */
	public void setCreateUserService(CreateUserService createUserService) {
		this.createUserService = createUserService;
	}

	/**
	 * @return the deleteUserService
	 */
	public DeleteUserService getDeleteUserService() {
		return new DeleteUserServiceImplService().getDeleteUserServiceImplPort();
	}

	/**
	 * @param deleteUserService the deleteUserService to set
	 */
	public void setDeleteUserService(DeleteUserService deleteUserService) {
		this.deleteUserService = deleteUserService;
	}

	/**
	 * @return the retrieveUserService
	 */
	public RetrieveUserService getRetrieveUserService() {
		return new RetrieveUserServiceImplService().getRetrieveUserServiceImplPort();
	}

	/**
	 * @param retrieveUserService the retrieveUserService to set
	 */
	public void setRetrieveUserService(RetrieveUserService retrieveUserService) {
		this.retrieveUserService = retrieveUserService;
	}
	
}
