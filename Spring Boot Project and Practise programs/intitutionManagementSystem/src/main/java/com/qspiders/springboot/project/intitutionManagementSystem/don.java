package com.qspiders.springboot.project.intitutionManagementSystem;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class don {

    @PostMapping("/jolly")
    String ad(){
        return "adhil";
    }

    @PutMapping("/jolly")
    String add(){
        return "Mohammed";
    }


    @GetMapping("/jolly")
    public String get() {
        String s=add();
        return s;
    }
}
