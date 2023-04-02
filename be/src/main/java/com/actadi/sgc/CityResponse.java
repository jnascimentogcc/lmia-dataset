package com.actadi.sgc;

import com.actadi.common.ResponseRoot;

import java.util.ArrayList;
import java.util.List;

public class CityResponse extends ResponseRoot {

    private List<CityDTO> cities = new ArrayList<>();

    public List<CityDTO> getCities() {
        return cities;
    }

    public void setCities(List<CityDTO> cities) {
        this.cities = cities;
    }
}
