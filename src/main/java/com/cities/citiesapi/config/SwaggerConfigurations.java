package com.cities.citiesapi.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
	 * 
	 * @return
	 */
	public Docket citiesAPI() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cities.citiesapi"))
				.paths(PathSelectors.ant("/**"))
				.build().apiInfo(getApiInfo());
	}

	/**
	 * Get api info
	 * @return
	 */
	private ApiInfo getApiInfo() {

		ApiInfo apiInfo = new ApiInfo("Cities-Api", "API from cities", "1.0.0", "",
				new Contact("juliherms", "https://github.com/juliherms", "j.a.vasconcelos321@gmail.com"), "", "",
				new ArrayList<>());

		return apiInfo;
	}
}