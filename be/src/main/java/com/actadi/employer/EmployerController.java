package com.actadi.employer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @PostMapping("${apiprefix.v1}/list")
    public ResponseEntity<Object> findEmployersByName(@RequestBody EmployerRequest employerRequest) {

        EmployerResponse employerResponse = new EmployerResponse();
        employerResponse.setEmployers(employerService.findByName(employerRequest.getName()));

        return new ResponseEntity<>(employerResponse, HttpStatus.OK);
    }


}
