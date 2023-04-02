package com.actadi.employer;

import com.actadi.common.ResponseRoot;

import java.util.ArrayList;
import java.util.List;

public class EmployerResponse extends ResponseRoot {

    private List<EmployerDTO> employers = new ArrayList<>();

    public List<EmployerDTO> getEmployers() {
        return employers;
    }

    public void setEmployers(List<EmployerDTO> employers) {
        this.employers = employers;
    }
}
