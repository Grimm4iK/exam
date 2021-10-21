package ru.digitalleague.test.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "teachers")
@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "department")
    private String department;
}
