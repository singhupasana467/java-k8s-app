package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class JavaK8sApp {
    public static void main(String args[]){
        SpringApplication.run(JavaK8sApp.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "Java app running from Kubernetes";
    }
}
