package com.example.proyepln.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI custOpenAPI(){
        return new OpenAPI()
        .info(new Info()
            .title("LENGUAJE NATURAL")
            .version("1.0")
            .description("VERSION 1")
            .contact(new Contact().name("STE").url("https://www.ste.cdmx.gob.mx/")));
    }

}
