package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.springdoc.core.GroupedOpenApi;



@Configuration
public class OpenApiConfig {
 
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()          
          .info(new Info()
                  .title("Open API created for CSN")
                  .description("This is an API created by the students David Carlsson and Mikolaj Wagner during a summer internship at CSN (the Swedish board of student finance). The purpose of the API is to enable and streamline spreading of information from the governal agency to external web pages. This in order to reach stakeholders such as students and pupils that would otherwise miss out on important information.")
                  .version("v1.0")
                  .contact(new Contact()
                        .name("David Carlsson & Mikolaj Wagner")
                        .url("")
                        .email("david.carlsson@csn.se"))
                  .termsOfService("https://www.csn.se/om-csn/lag-och-ratt.html")
                  .license(new License()
                        .name("Apache License")
                        .url("https://apache.org/licenses/LICENSE-2.0"))
          );
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/public/**")
                .pathsToExclude("/admin/**")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("admin")
                .pathsToMatch("/admin/**", "/public/**")
                .build();
    }
}