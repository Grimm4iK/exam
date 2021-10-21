package ru.digitalleague.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.test.entity.Student;
import ru.digitalleague.test.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public Long addStudent(@RequestBody Student student){
        Student newStudent = studentService.addStudent(student);
        return newStudent.getId();
    }

    @DeleteMapping("/deletestudent")
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
    }

    @PutMapping("/updateStudent")
    public Long updateStudent(@RequestBody Student student){
        Student updateStudent = studentService.updateStudent(student);
        return updateStudent.getId();
    }
}
