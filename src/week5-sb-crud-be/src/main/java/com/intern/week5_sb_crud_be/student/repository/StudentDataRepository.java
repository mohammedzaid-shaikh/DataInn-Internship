package com.intern.week5_sb_crud_be.student.repository;

import com.intern.week5_sb_crud_be.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // :)
public interface StudentDataRepository extends JpaRepository<Student, Long> {

}
