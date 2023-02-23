package com.badmashcompany.studentManagementPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    Service service;

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo){
        return service.get_info(admnNo);
    }

    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody() Student student){
        service.addStudent(student);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }


//    @DeleteMapping("/delete/{id}")
//    String deleteStudent(@PathVariable("id") int admnNo){
//
//    }

    // Homework
    // Put - id
    // Get API - name
}
