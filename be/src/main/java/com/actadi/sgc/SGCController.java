package com.actadi.sgc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/sgc")
public class SGCController {

    @Autowired
    private SGCService sgcService;

    @GetMapping("${apiprefix.v1}/province/list")
    public ResponseEntity<Object> findAllProvinces() {

        ProvinceResponse provinceResponse = new ProvinceResponse();
        provinceResponse.setProvinces(sgcService.findAllProvinces());

        return new ResponseEntity<>(provinceResponse, HttpStatus.OK);
    }

    @GetMapping("${apiprefix.v1}/city/{idProvince}")
    public ResponseEntity<Object> findCitiesByProvinve(@PathVariable String idProvince) {

        CityResponse cityResponse = new CityResponse();
        cityResponse.setCities(sgcService.findCitiesByProvinve(idProvince));

        return new ResponseEntity<>(cityResponse, HttpStatus.OK);
    }

}
