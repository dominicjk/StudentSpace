package com.studentspace.StudentSpace;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, ObjectId> {
         Optional<Student> findStudentsByStudentId(String studentId);
}
