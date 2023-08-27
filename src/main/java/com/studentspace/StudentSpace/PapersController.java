package com.studentspace.StudentSpace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/papers")
public class PapersController {

    @Autowired
    private PapersService papersService;

//    @PostMapping
//    public ResponseEntity<Papers> createPapers(@RequestBody Map<String, String> payload) {
//        return new ResponseEntity<Papers>(papersService.createPaper(payload.get("papersBody"), payload.get("testId")), HttpStatus.CREATED);
//    }

}
