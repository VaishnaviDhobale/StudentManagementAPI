package com.example.sma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sma.models.StudentModel;


// we are extending this repo because if we need any custom method then we can write here in this repo 
public interface StudentRepository extends JpaRepository<StudentModel, Long>{

}
