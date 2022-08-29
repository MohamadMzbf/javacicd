package com.githubcicd.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestcicdApplication {


    @GetMapping("/Welcome")
    public String Welcome(){
        return  "Welcome to My CICD Project test";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestcicdApplication.class, args);
    }

}
