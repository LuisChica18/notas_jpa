package com.example.notas_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NotasJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotasJpaApplication.class, args);
    }

}
