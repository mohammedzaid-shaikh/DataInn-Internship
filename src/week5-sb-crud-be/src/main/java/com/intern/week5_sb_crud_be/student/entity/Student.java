package com.intern.week5_sb_crud_be.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity "Student.java" represents a table called "students" in the database.

@Entity     // @Entity: marks a class as a table, here class "Student", JPA.
@Table(name = "students")   // @Table(): name of the table in DB will be "students", JPA.
@Data   // @Data: generates @Getter, @Setter, @toString(), etc. Lombok.
@NoArgsConstructor  // @NoArgsConstructor: generates no argument constructor, Lombok
@AllArgsConstructor     // @AllArgsConstructor: generates constructor with all fields, Lombok
@Builder
public class Student {

    @Id // @Id: Primary Key of the table "students", JPA annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue: auto-generate Student ID, a JPA provided annotation
    private Long id;

    @Column(nullable = false) // @Column() database table column cannot store NULL values.
    private String name;

    @Column(nullable = false, unique = true)// @Column() column must be unique across all rows in the table.
    private String email;

    @Column
    private Integer age;

    @Column
    private String course;
}

