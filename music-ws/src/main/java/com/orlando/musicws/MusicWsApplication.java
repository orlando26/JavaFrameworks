package com.orlando.musicws;

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
// Repository, Controller, Bean - POJO, Service, Unit Test, Entity
@SpringBootApplication
@EnableSwagger2
public class MusicWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicWsApplication.class, args);
	}
	
	// Docket
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Music-API")
				.select()
				.paths(PathSelectors.regex("/api/v1.*"))
				.build().apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo("Music API", 
							"REST Services for music App", "1.0", "API Terms of service",
							new Contact("Orlando Loza", "orlando.com", "orlandolozaarr@gmail.com"),
							"API Licence",
							"API Licence URL",
							Collections.EMPTY_LIST);
	}
	
}
