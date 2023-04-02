package com.actadi.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping("${apiprefix.v1}/stream/list")
    public ResponseEntity<Object> findAllProgramStream() {

        ProgramStreamResponse programStreamResponse = new ProgramStreamResponse();
        programStreamResponse.setPrograms(programService.findAllPrograms());

        return new ResponseEntity<>(programStreamResponse, HttpStatus.OK);
    }


}
