package com.sayhello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SayhelloApplication {

    @GetMapping("/greeting")
    public static void main(String[] args) {
        SpringApplication.run(SayhelloApplication.class, args);
    }

}
