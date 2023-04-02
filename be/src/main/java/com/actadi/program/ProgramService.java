package com.actadi.program;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProgramService {

    @Autowired
    private ProgramStreamRepository programStreamRepository;

    public List<ProgramStreamDTO> findAllPrograms() {

        return programStreamRepository.findAllByOrderByName()
                .stream()
                .map(programStreamEntity -> {
                    ProgramStreamDTO programStreamDTO = new ProgramStreamDTO();
                    BeanUtils.copyProperties(programStreamEntity, programStreamDTO);
                    return programStreamDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
