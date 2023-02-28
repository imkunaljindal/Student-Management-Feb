package com.badmashcompany.studentManagementPortal;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
//@RequestMapping("random")
public class StudentController {

   // public Logger logger = LoggerFactory.getLogger(StudentController.class);
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

    @GetMapping("/logs")
    public void logs(){
        log.info("This is info ka log");
        log.error("This is error ka log");
        log.trace("This is trace ka log");
    }


//    @DeleteMapping("/delete/{id}")
//    String deleteStudent(@PathVariable("id") int admnNo){
//
//    }

    // Homework
    // Put - id
    // Get API - name
}
