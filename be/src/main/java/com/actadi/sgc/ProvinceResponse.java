package com.actadi.sgc;

import com.actadi.common.ResponseRoot;

import java.util.ArrayList;
import java.util.List;

public class ProvinceResponse extends ResponseRoot {

    private List<ProvinceDTO> provinces = new ArrayList<>();

    public List<ProvinceDTO> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<ProvinceDTO> provinces) {
        this.provinces = provinces;
    }
}
