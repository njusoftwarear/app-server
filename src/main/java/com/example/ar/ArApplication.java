package com.example.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ArApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArApplication.class, args);
    }

}
