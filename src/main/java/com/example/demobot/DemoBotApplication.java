package com.example.demobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBotApplication.class, args);
    }

}
