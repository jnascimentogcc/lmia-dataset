package com.actadi.lmia;

import com.actadi.search.SearchDTO;
import com.actadi.search.SearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LmiaService {

    private static final String PARAM_PROVINCE = "PROVINCE";
    private static final String PARAM_CITY = "CITY";
    private static final String PARAM_PROGRAM = "PROGRAM";
    private static final String PARAM_EMPLOYER = "EMPLOYER";
    private static final String PARAM_NOC = "NOC";

    @Autowired
    private LmiaRepository lmiaRepository;

    @Autowired
    SearchService searchService;

    public List<LmiaDTO> find(String idProvince, String idCity, String idProgramStream, String idEmployer, String idNoc) {

        HashMap<String, String> mapParams = new HashMap<>();
        if (idProvince != null && (!"".equals(idProvince))) {
            mapParams.put(PARAM_PROVINCE, idProvince);
        }
        if (idCity != null && (!"".equals(idCity))) {
            mapParams.put(PARAM_CITY, idCity);
        }
        if (idProgramStream != null && (!"".equals(idProgramStream))) {
            mapParams.put(PARAM_PROGRAM, idProgramStream);
        }
        if (idEmployer != null && (!"".equals(idEmployer))) {
            mapParams.put(PARAM_EMPLOYER, idEmployer);
        }
        if (idNoc != null && (!"".equals(idNoc))) {
            mapParams.put(PARAM_NOC, idNoc);
        }

        List<LmiaDTO> listLmia = new ArrayList<>();
        if (!mapParams.isEmpty()) {
            listLmia = this.getListLMIA(mapParams);
            searchService.saveSearch(idProvince, idCity, idProgramStream, idEmployer, idNoc);
        }

        return listLmia;
    }

    public List<LmiaDTO> findBySearch(String idSearch) {

        SearchDTO searchDTO = searchService.findByID(idSearch);
        HashMap<String, String> mapParams = new HashMap<>();
        if (searchDTO.getIdProvince() != null) {
            mapParams.put(PARAM_PROVINCE, searchDTO.getIdProvince());
        }
        if (searchDTO.getIdCity() != null) {
            mapParams.put(PARAM_CITY, searchDTO.getIdCity());
        }
        if (searchDTO.getIdProgramStream() != null) {
            mapParams.put(PARAM_PROGRAM, searchDTO.getIdProgramStream());
        }
        if (searchDTO.getIdEmployer() != null) {
            mapParams.put(PARAM_EMPLOYER, searchDTO.getIdEmployer());
        }
        if (searchDTO.getIdNOC() != null) {
            mapParams.put(PARAM_NOC, searchDTO.getIdNOC());
        }

        List<LmiaDTO> listLmia = new ArrayList<>();
        if (!mapParams.isEmpty()) {
            listLmia = this.getListLMIA(mapParams);
        }

        return listLmia;

    }

    public List<LmiaDTO> getListLMIA(HashMap<String, String> params) {

        List<LmiaEntity> listEntity = lmiaRepository.findAll(params);
        return listEntity
                .stream()
                .map(e -> {
                    LmiaDTO lmiaDTO = new LmiaDTO();
                    BeanUtils.copyProperties(e, lmiaDTO);
                    lmiaDTO.setProvince(e.getProvinceEntity().getName());
                    lmiaDTO.setProgramStream(e.getProgramStreamEntity().getName());
                    lmiaDTO.setEmployer(e.getEmployerEntity().getName());
                    lmiaDTO.setAddress(e.getEmployerEntity().getAddress());
                    lmiaDTO.setOccupation(e.getOccupationEntity().getTitle());
                    return lmiaDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
