package com.qspiders.springboot.project.intitutionManagementSystem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adhil")
public class studentController {
    @GetMapping("/a18")
    public String get() {
        return "RCB "+"\n"+"virat Kholi";
    }
}
