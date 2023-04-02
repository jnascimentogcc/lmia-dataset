package com.actadi.noc;

import com.actadi.common.ResponseRoot;
import com.actadi.sgc.ProvinceDTO;

import java.util.ArrayList;
import java.util.List;

public class OccupationResponse extends ResponseRoot {

    private List<OccupationDTO> occupations = new ArrayList<>();

    public List<OccupationDTO> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<OccupationDTO> occupations) {
        this.occupations = occupations;
    }
}
