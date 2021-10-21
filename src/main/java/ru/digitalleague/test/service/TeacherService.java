package ru.digitalleague.test.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.test.entity.Student;
import ru.digitalleague.test.entity.Teacher;
import ru.digitalleague.test.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Teacher teacher){
        teacherRepository.delete(teacher);
    }

    public Teacher updateTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
