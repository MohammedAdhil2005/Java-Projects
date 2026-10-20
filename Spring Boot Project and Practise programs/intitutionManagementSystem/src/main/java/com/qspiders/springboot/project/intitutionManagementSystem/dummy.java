package com.qspiders.springboot.project.intitutionManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dummy {

    @GetMapping("/hello")
    String print(){
        System.out.println("Adhil");
        return "heyy";
    }
}
