package ru.digitalleague.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
