package com.orlando.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * DAO, Depandancy Injection, Singleton
 * interfaces, implementaciones 
 * Interface(PersonDAO -> PersonDAOImpl)
 * CRUD(Create, Read, Update, Delete)
 */
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}

}
//build -> war

// DAO (Data Access Object)