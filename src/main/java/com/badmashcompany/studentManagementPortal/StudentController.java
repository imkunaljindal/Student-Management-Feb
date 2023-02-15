package com.badmashcompany.studentManagementPortal;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();  // database

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo, @RequestParam("id2") int admnNo2){
        return db.get(admnNo);
    }

    @PostMapping("/add")
    String addStudent(@RequestBody() Student student){
        db.put(student.getAdmnNo(),student);
        return "Student has been added successfully";
    }

    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admnNo){
        db.remove(admnNo);
        return "Student deleted";
    }

    // Homework
    // Put - id
    // Get API - name
}
