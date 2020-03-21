package com.orlando.restServices;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //swagger: Framework to REST api Documentation
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Music.API")
				.select()
				.paths(PathSelectors.regex("/api/v1.*"))
				.build().apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo("Music API",
				"Rest services for Music API project", 
				"1.0", "API Terms of service URL", 
				new Contact("Orlando Loza Castro", "orlando26.github.io", "orlandolozaarr@gmail.com"),
				"API Licence",
				"API Licence URL",
				Collections.EMPTY_LIST);
	}

}
