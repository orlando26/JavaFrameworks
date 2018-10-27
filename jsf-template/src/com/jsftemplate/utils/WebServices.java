package com.jsftemplate.utils;

import com.orlando.ws.CreatePersonService;
import com.orlando.ws.CreatePersonServiceImplService;
import com.orlando.ws.DeletePersonService;
import com.orlando.ws.DeletePersonServiceImplService;
import com.orlando.ws.RetrieveCitiesService;
import com.orlando.ws.RetrieveCitiesServiceImplService;
import com.orlando.ws.RetrievePersonService;
import com.orlando.ws.RetrievePersonServiceImplService;
import com.orlando.ws.RetrieveStatesService;
import com.orlando.ws.RetrieveStatesServiceImplService;
import com.orlando.ws.UpdatePersonService;
import com.orlando.ws.UpdatePersonServiceImplService;

public class WebServices {
	
	CreatePersonService createPersonService;
	
	RetrieveStatesService retrieveStatesService;
	
	RetrieveCitiesService retrieveCitiesService;
	
	RetrievePersonService retrievePersonservice;
	
	DeletePersonService deletePersonService;
	
	UpdatePersonService updatePersonService;
	
	

	public DeletePersonService getDeletePersonService() {
		return new DeletePersonServiceImplService().getDeletePersonServiceImplPort();
	}

	public void setDeletePersonService(DeletePersonService deletePersonService) {
		this.deletePersonService = deletePersonService;
	}

	public UpdatePersonService getUpdatePersonService() {
		return new UpdatePersonServiceImplService().getUpdatePersonServiceImplPort();
	}

	public void setUpdatePersonService(UpdatePersonService updatePersonService) {
		this.updatePersonService = updatePersonService;
	}

	public RetrievePersonService getRetrievePersonservice() {
		return new RetrievePersonServiceImplService().getRetrievePersonServiceImplPort();
	}

	public void setRetrievePersonservice(RetrievePersonService retrievePersonservice) {
		this.retrievePersonservice = retrievePersonservice;
	}

	public RetrieveStatesService getRetrieveStatesService() {
		return new RetrieveStatesServiceImplService().getRetrieveStatesServiceImplPort();
	}

	public void setRetrieveStatesService(RetrieveStatesService retrieveStatesService) {
		this.retrieveStatesService = retrieveStatesService;
	}

	public RetrieveCitiesService getRetrieveCitiesService() {
		return new RetrieveCitiesServiceImplService().getRetrieveCitiesServiceImplPort();
	}

	public void setRetrieveCitiesService(RetrieveCitiesService retrieveCitiesService) {
		this.retrieveCitiesService = retrieveCitiesService;
	}

	public CreatePersonService getCreatePersonService() {
		
		return new CreatePersonServiceImplService().getCreatePersonServiceImplPort();
	}

	public void setCreatePersonService(CreatePersonService createPersonService) {
		this.createPersonService = createPersonService;
	}
	
	
	

}
