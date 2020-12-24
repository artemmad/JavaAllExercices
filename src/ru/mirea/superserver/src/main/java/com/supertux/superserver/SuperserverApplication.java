package com.supertux.superserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
public class SuperserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperserverApplication.class, args);
    }
     @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
     }

}
