package com.studentspace.StudentSpace;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationRepository extends MongoRepository<Examinations, ObjectId> {
}
