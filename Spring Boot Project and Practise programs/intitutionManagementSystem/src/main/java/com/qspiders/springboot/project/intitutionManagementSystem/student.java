package com.qspiders.springboot.project.intitutionManagementSystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class student {

    @GetMapping("/Rollno/{id}")
    String getstu(@PathVariable int id){
        return "Student roll no is :" + id;
    }

    @GetMapping("/Rollno")
    String getstuparam(@RequestParam("heyhere->") int id){
        return "Student roll no is :" + id;
    }

//    @PostMapping("/Rollno")
//    String postget(@RequestBody int roll){
//
//    }
}
