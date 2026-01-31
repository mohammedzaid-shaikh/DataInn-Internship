package com.internship.week4springbootcrudapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@RestController
@RequestMapping("/api/demo-students")
public class DemoStudentController {

    private Map<Integer, DemoStudent> studentRepo = new HashMap<>();
    private Integer nextId = 1;

    // CREATE
    @PostMapping("/create")
    public DemoStudent createStudent(@RequestBody DemoStudent student) {
        student.setId(nextId++);
        studentRepo.put(student.getId(), student);
        return student;
    }

    // READ ALL
    @GetMapping("/listall")
    public Collection<DemoStudent> getAllStudents() {
        return studentRepo.values();
    }

    // READ ONE
    @GetMapping("getbyid/{id}")
    public DemoStudent getStudent(@PathVariable Integer id) {
        return studentRepo.get(id);
    }

    // UPDATE
    @PutMapping("updatebyid/{id}")
    public DemoStudent updateStudent(@PathVariable Integer id, @RequestBody DemoStudent student) {
        student.setId(id);
        studentRepo.put(id, student);
        return student;
    }

    // DELETE
    @DeleteMapping("deletebyid/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentRepo.remove(id);
        return "DemoStudent with ID " + id + " deleted";
    }
}

