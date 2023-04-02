package com.actadi.lmia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/lmia")
public class LmiaController {

    @Autowired
    private LmiaService lmiaService;

    @PostMapping("${apiprefix.v1}/search")
    public ResponseEntity<Object> findAllProvinces(@RequestBody LmiaRequest lmiaRequest) {

        LmiaResponse lmiaResponse = new LmiaResponse();
        lmiaResponse.setLmias(lmiaService.find(lmiaRequest.getIdProvince(), lmiaRequest.getIdCity(), lmiaRequest.getIdProgramStream(), lmiaRequest.getIdEmployer(), lmiaRequest.getIdNOC()));

        return new ResponseEntity<>(lmiaResponse, HttpStatus.OK);
    }

    @GetMapping("${apiprefix.v1}/search/{idSearch}")
    public ResponseEntity<Object> findAllProvinces(@PathVariable String idSearch) {

        LmiaResponse lmiaResponse = new LmiaResponse();
        lmiaResponse.setLmias(lmiaService.findBySearch(idSearch));

        return new ResponseEntity<>(lmiaResponse, HttpStatus.OK);
    }

}
