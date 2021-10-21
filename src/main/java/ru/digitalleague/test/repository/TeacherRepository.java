package ru.digitalleague.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.test.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
