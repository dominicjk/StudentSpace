package com.studentspace.StudentSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "examinations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Examinations {
    @Id
    private ObjectId recordId;
    private String studentId;
    private String testId;
    private float achieved_marks;
}
