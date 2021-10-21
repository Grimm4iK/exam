package ru.digitalleague.test.controller;

import org.springframework.web.bind.annotation.*;
import ru.digitalleague.test.entity.Student;
import ru.digitalleague.test.entity.Teacher;
import ru.digitalleague.test.service.TeacherService;

import java.util.List;

@RestController
public class TeacherController {
    private final TeacherService teacherService;


    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<Teacher> findAll(){
        return teacherService.getAllTeacher();
    }

    @PostMapping("/addTeacher")
    public Long addTeacher(@RequestBody Teacher teacher){
        Teacher newTeacher = teacherService.addTeacher(teacher);
        return newTeacher.getId();
    }

    @DeleteMapping("/deleteTeacher")
    public void deleteTeacher(@RequestBody Teacher teacher){
        teacherService.deleteTeacher(teacher);
    }

    @PutMapping("/updateTeacher")
    public Long updateTeacher(@RequestBody Teacher teacher){
        Teacher updateTeacher = teacherService.updateTeacher(teacher);
        return updateTeacher.getId();
    }
}
