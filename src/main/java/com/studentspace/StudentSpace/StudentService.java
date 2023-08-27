package com.studentspace.StudentSpace;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> specificStudent(String studentId) {
        return studentRepository.findStudentsByStudentId(studentId);
    }

}
