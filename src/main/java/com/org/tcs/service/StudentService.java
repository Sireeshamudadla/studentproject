package com.org.tcs.service;

import com.org.tcs.model.Student;

import java.util.List;

public interface StudentService {


    public void createStudent(Student student);
    public List<Student> getAllStudent();
    public void updateStudent(Student student);
    public Student findById(Integer id);
    public String deleteByAddress(String address);

}
