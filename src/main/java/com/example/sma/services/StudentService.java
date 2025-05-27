package com.example.sma.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sma.models.StudentModel;
import com.example.sma.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    // post/add student data into DB
    public Object addStudentData(StudentModel student) {
        try {
            repo.save(student);

            // create hashmap to return the updated object
            Map<String, Object> response = new HashMap<>();
            response.put("message", "Student Added.");
            response.put("studentData", student);
            return response;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // get all student data from DB
    public List<StudentModel> getAllStudentData() {
        return repo.findAll();
    }

    // get student by id
    public Object getStudentById(Long id) {
        try {
            if (repo.existsById(id)) {
                return repo.findById(id);
            } else {
                return "Student with ID " + id + " does not found.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // update student data using put it will update whole student object of given id
    public String updateStudentData(Long id, StudentModel newData) {
        try {
            StudentModel studentData = repo.findById(id).orElseThrow();

            // update values one by one
            studentData.setName(newData.getName());
            studentData.setEmail(newData.getEmail());
            studentData.setCourse(newData.getCourse());

            repo.save(studentData);
            return "Student with id " + id + " updated.";
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    // delete student
    public String deleteStudent(Long id) {
        try {
            if (repo.existsById(id)) {
                repo.deleteById(id);
                return "Student with ID " + id + " deleted.";
            } else {
                return "Student with ID " + id + " does not found.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
