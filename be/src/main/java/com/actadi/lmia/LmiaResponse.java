package com.actadi.lmia;

import com.actadi.common.ResponseRoot;
import com.actadi.employer.EmployerDTO;

import java.util.ArrayList;
import java.util.List;

public class LmiaResponse extends ResponseRoot {

    private List<LmiaDTO> lmias = new ArrayList<>();

    public List<LmiaDTO> getLmias() {
        return lmias;
    }

    public void setLmias(List<LmiaDTO> lmias) {
        this.lmias = lmias;
    }
}
