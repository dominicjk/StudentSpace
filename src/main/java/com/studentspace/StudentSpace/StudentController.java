package com.studentspace.StudentSpace;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<List<Student>>(studentService.allStudents(), HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Optional<Student>> getSpecificStudent(@PathVariable String studentId) {
        return new ResponseEntity<Optional<Student>>(studentService.specificStudent(studentId), HttpStatus.OK);
    }
}
