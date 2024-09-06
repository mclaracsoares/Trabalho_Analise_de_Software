package com.projeto.gestao_escolar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld() {return "Hello World!";}
}
