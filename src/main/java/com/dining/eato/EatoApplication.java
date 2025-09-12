package com.dining.eato;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class EatoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EatoApplication.class, args);
        log.info("Eato Application Started");
    }
}