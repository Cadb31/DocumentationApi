package com.home.documentation.api;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
    public Docket swaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)  
                .select()                                  
                .apis(RequestHandlerSelectors.any())              
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(apiInfo())                
                .directModelSubstitute(LocalDate.class, String.class);
          }
	
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("Documentation Api")
				.description("Description of the api methods")
				.version("1.0")
				.contact(contact())
				.termsOfServiceUrl("Terms of service")				
				.build();
		return apiInfo;
	}

	private Contact contact() {
		Contact c = new Contact("Woowrale", "http://woowrale.com", "woowrale@gmail.com");
		return c;
	}
	
}