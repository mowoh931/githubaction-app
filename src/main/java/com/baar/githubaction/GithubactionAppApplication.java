package com.baar.githubaction;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController
public class GithubactionAppApplication {

    @GetMapping("/")
    public String message() {
        log.info("Hello World, Github Actions! in Spring Boot");

        return "Hello World, Github Actions! in Spring Boot";
    }

    @GetMapping("/welcome")
    public String welcome() {
        log.info("Welcome to Github Actions! in Spring Boot");

        return "Welcome to Github Actions! in Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubactionAppApplication.class, args);
    }

}
