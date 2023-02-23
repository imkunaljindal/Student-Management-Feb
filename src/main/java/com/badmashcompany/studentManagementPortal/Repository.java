package com.badmashcompany.studentManagementPortal;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {

    Map<Integer,Student> db = new HashMap<>();  // database

    public Student getInfo(int id){
        return db.get(id);
    }
    public void addStudent(Student student){
        db.put(student.getAdmnNo(),student);
    }
}
