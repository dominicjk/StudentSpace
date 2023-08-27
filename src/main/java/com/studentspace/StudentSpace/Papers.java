package com.studentspace.StudentSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.*;

@Document(collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Papers {

    @Id
    private ObjectId record_id;
    private String testId;
    private LocalDateTime dateTimeOfTest;
    private boolean hasResit;
    private LocalDateTime dataTimeOfResit;
    private String moduleCode;
    private float totalMarks;
    private float passingScore;
    private String location;
}
