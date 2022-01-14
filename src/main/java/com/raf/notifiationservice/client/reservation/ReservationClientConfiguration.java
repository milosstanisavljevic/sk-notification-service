package com.raf.notifiationservice.client.reservation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class ReservationClientConfiguration {
    @Bean
    public RestTemplate reservationServiceRestTemplate(){
        RestTemplate template = new RestTemplate();
        template.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081"));

        return template;
    }
}
