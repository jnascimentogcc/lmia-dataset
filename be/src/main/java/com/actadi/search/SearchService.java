package com.actadi.search;

import com.actadi.utils.DateHelp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    SearchRepository searchRepository;

    public void saveSearch(String idProvince, String idCity, String idProgramStream, String idEmployer, String idNOC) {

        SearchEntity searchEntity = new SearchEntity();
        searchEntity.setIdProvince(idProvince);
        searchEntity.setIdCity(idCity);
        searchEntity.setIdProgramStream(idProgramStream);
        searchEntity.setIdEmployer(idEmployer);
        searchEntity.setIdNOC(idNOC);
        searchEntity.setTimeZone("UTC");
        searchEntity.setCreateTS(DateHelp.getGMTFromEuropeDublin());
        searchRepository.save(searchEntity);

    }

    public SearchDTO findByID(String idSearch) {

        SearchEntity searchEntity = searchRepository.findById(idSearch).orElseThrow();
        SearchDTO searchDTO = new SearchDTO();
        BeanUtils.copyProperties(searchEntity, searchDTO);

        return searchDTO;
    }
}
