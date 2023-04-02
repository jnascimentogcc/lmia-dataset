package com.actadi.sgc;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SGCService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private CityRepository cityRepository;

    public List<ProvinceDTO> findAllProvinces() {

        return provinceRepository.findAllByOrderByName()
                .stream()
                .map(provinceEntity -> {
                    ProvinceDTO provinceDTO = new ProvinceDTO();
                    BeanUtils.copyProperties(provinceEntity, provinceDTO);
                    return provinceDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<CityDTO> findCitiesByProvinve(String idProvince) {

        return cityRepository.findByIdProvinceOrderByName(idProvince)
                .stream()
                .map(cityEntity -> {
                    CityDTO cityDTO = new CityDTO();
                    BeanUtils.copyProperties(cityEntity, cityDTO);
                    return cityDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
