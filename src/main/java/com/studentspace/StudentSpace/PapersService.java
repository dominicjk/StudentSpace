package com.studentspace.StudentSpace;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class PapersService {
    @Autowired
    private PapersRepository papersRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Papers> allPapers() {return papersRepository.findAll();}

    public Optional<Papers> specificPaper(String testId) {
        return papersRepository.findPapersByTestId(testId);
    }

    public Papers createPaper(String testId, LocalDateTime dateTimeOfTest, boolean hasResit, LocalDateTime dateTimeOfResit,
                              String moduleCode, float totalMarks, float passingScore, String location) {

        // create paper with parameters
        Papers paper = new Papers();
        paper.setTestId(testId);
        paper.setDateTimeOfTest(dateTimeOfTest);
        paper.setHasResit(hasResit);
        paper.setDataTimeOfResit(dateTimeOfResit);
        paper.setModuleCode(moduleCode);
        paper.setTotalMarks(totalMarks);
        paper.setPassingScore(passingScore);
        paper.setLocation(location);
        paper.setRecord_id(new ObjectId());

        papersRepository.insert(paper);

        return paper;
    }
}
