package com.sparta.beckendproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BeckendProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeckendProjectApplication.class, args);
    }

}
