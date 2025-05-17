package com.dod.jdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdrApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdrApplication.class, args);
        System.out.println("Hello World ! ");
    }

}
