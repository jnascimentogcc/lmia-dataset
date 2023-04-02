package com.actadi.employer;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    public List<EmployerDTO> findByName(String name) {

        return employerRepository.findByNameContains(name.trim())
                .stream()
                .map(employerEntity -> {
                    EmployerDTO employerDTO = new EmployerDTO();
                    BeanUtils.copyProperties(employerEntity, employerDTO);
                    return employerDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
