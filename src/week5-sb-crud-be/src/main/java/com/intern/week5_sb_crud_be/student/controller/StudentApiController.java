package com.intern.week5_sb_crud_be.student.controller;

import com.intern.week5_sb_crud_be.student.entity.Student;
import com.intern.week5_sb_crud_be.student.service.StudentManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentApiController {

    private final StudentManagerService service;

    @Autowired
    public StudentApiController(StudentManagerService service) {
        this.service = service;
    }

    // Create
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student created = service.createStudent(student);

        URI location = URI.create(String.format("/api/students/get/%d", created.getId()));
        return ResponseEntity.created(location).body(created);
    }

    // Read all
    @GetMapping("/get-all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> list = service.getAllStudents();
        return ResponseEntity.ok(list);
    }

    // Read by id
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Optional<Student> opt = service.getStudentById(id);
        return opt
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id,
            @RequestBody Student student
    ) {
        Optional<Student> updated = service.updateStudent(id, student);
        return updated
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
        Optional<Student> studentOpt = service.getStudentById(id);

        if (studentOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.deleteStudent(id);
        return ResponseEntity.ok(studentOpt.get());
    }

}
