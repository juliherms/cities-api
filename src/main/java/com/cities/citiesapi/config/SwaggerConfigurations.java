package com.cities.citiesapi.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * This class responsible swagger configuration
 * 
 * @author j.a.vasconcelos
 *
 */
@Configuration
public class SwaggerConfigurations {

	/**
	 * Swagger documentation API
	 * @return
	 */
	public Docket citiesAPI() {
	
		return new Docket(DocumentationType.SWAGGER_2).
				select()
				.apis(RequestHandlerSelectors.basePackage("com.cities.citiesapi"))
				.paths(PathSelectors.ant("/**"))
				.build();
	
	
	}
}