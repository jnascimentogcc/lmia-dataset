package com.actadi.noc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/noc")
public class OccupationController {

    @Autowired
    private OccupationService occupationService;

    @GetMapping("${apiprefix.v1}/list/root")
    public ResponseEntity<Object> findLevelRoot() {

        OccupationResponse occupationResponse = new OccupationResponse();
        List<OccupationDTO> listOccupation = occupationService.findByLevelRoot();
        occupationResponse.setOccupations(occupationService.cleanRelations(listOccupation));

        return new ResponseEntity<>(occupationResponse, HttpStatus.OK);
    }

    @GetMapping("${apiprefix.v1}/list/trunk/{idRoot}")
    public ResponseEntity<Object> findLevelTrunk(@PathVariable String idRoot) {

        OccupationResponse occupationResponse = new OccupationResponse();
        List<OccupationDTO> listOccupation = occupationService.findByNOC(idRoot);
        occupationResponse.setOccupations(occupationService.cleanRelations(listOccupation));

        return new ResponseEntity<>(occupationResponse, HttpStatus.OK);
    }

    @GetMapping("${apiprefix.v1}/list/branch/{idTrunk}")
    public ResponseEntity<Object> findLevelBranch(@PathVariable String idTrunk) {

        OccupationResponse occupationResponse = new OccupationResponse();
        List<OccupationDTO> listOccupation = occupationService.findByNOC(idTrunk);
        occupationResponse.setOccupations(occupationService.cleanRelations(listOccupation));

        return new ResponseEntity<>(occupationResponse, HttpStatus.OK);
    }

    @GetMapping("${apiprefix.v1}/list/leaf/{idBranch}")
    public ResponseEntity<Object> findLevelLeaf(@PathVariable String idBranch) {

        OccupationResponse occupationResponse = new OccupationResponse();
        List<OccupationDTO> listOccupation = occupationService.findByNOC(idBranch);
        occupationResponse.setOccupations(occupationService.cleanRelations(listOccupation));

        return new ResponseEntity<>(occupationResponse, HttpStatus.OK);
    }

}
