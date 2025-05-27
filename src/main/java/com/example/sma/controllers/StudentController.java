package com.example.sma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sma.models.StudentModel;
import com.example.sma.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    // test API endpoint
    @GetMapping("/")
    public String testServerRunningOrNot() {
        return "Working";
    }

    // post student data
    @PostMapping("/addStudent")
    public Object addStudentData(@RequestBody StudentModel studentData) {
        // System.out.println(studentData);
        return service.addStudentData(studentData);
    }

    // get all student data
    @GetMapping("/getAllStudents")
    public List<StudentModel> getAllStudentData() {
        return service.getAllStudentData();
    }

    // get student by id
    @GetMapping("/getStudentById/{id}")
    public Object getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // update data using PUT
    @PutMapping("/updateStudetData/{id}")
    public String updateStudentData(@PathVariable Long id, @RequestBody StudentModel newData) {
        return service.updateStudentData(id, newData);
    }

    // delete student
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        return service.deleteStudent(id);
    }
}
