package ru.digitalleague.test.service;

import org.springframework.stereotype.Service;
import ru.digitalleague.test.entity.Student;
import ru.digitalleague.test.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
}
