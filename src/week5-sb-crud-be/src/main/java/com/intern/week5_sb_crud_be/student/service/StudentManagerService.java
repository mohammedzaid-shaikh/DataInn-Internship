package com.intern.week5_sb_crud_be.student.service;

import com.intern.week5_sb_crud_be.student.entity.Student;
import com.intern.week5_sb_crud_be.student.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentManagerService {

    @Autowired
    private StudentDataRepository repository;

    // Create
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    // Read all
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Read by id
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    // Update
    public Optional<Student> updateStudent(Long id, Student incoming) {
        return repository.findById(id).map(existing -> {
            if (incoming.getName() != null) existing.setName(incoming.getName());
            if (incoming.getEmail() != null) existing.setEmail(incoming.getEmail());
            if (incoming.getAge() != null) existing.setAge(incoming.getAge());
            if (incoming.getCourse() != null) existing.setCourse(incoming.getCourse());
            return repository.save(existing);
        });
    }

    // Delete
    public boolean deleteStudent(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
