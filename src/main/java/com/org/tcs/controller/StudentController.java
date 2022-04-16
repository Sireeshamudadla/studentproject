package com.org.tcs.controller;

import com.org.tcs.model.Student;
import com.org.tcs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

  @Autowired
    StudentService studentService;



    @PostMapping("/create")
    public void createstudent(@RequestBody Student student){
        studentService.createStudent(student);

    }

    @GetMapping("/getAll")
    public List<Student>getAllStudent(){
        List<Student>stulist =studentService.getAllStudent();
        return stulist;
    }


    @PutMapping("/update")
    public void updatestudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Integer id){
        Student srt=studentService.findById(id);
        return srt;
    }
    @DeleteMapping("/deleteByAddress/{address}")
    public String deleteByAddress(@PathVariable String address){
        String srm  =studentService.deleteByAddress(address);
        return srm;

    }
}
