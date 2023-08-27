package com.studentspace.StudentSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@Document(collection = "students")
@Data
@AllArgsConstructor
@CrossOrigin(origins = "*")

@NoArgsConstructor
public class Student {
    @Id
    private ObjectId record_id;

    @Id
    private String studentId;
    private String fullName;
    private String major;
    private float gpa;
    private String sex;
    private String profile;
    private String year;
    @DocumentReference
    private ArrayList<Examinations> examinations;
}
