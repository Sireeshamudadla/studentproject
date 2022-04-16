package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService  {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student>stuhk=studentRepo.findAll();
        return stuhk;
    }

    @Override
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student findById(Integer id) {
        Student student=studentRepo.getById(id);
        return student;
    }

    @Override
    public String deleteByAddress(String address) {
        studentRepo.deleteByAddress(address);

        return "success";
    }


}
