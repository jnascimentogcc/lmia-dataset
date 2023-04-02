package com.actadi.noc;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OccupationService {

    private final static Integer LEVEL_OCCUPATION = 4;

    @Autowired
    private OccupationRepository occupationRepository;

    public List<OccupationDTO> findByLevelRoot() {

        return this.convertOccupation(occupationRepository.findByLevelOrderByCode(1));
    }

    public List<OccupationDTO> findByNOC(String idNOC) {

        OccupationEntity occupationEntity = new OccupationEntity();
        occupationEntity.setId(idNOC);
        return this.convertOccupation(occupationRepository.findByOccupationEntityOrderByCode(occupationEntity));
    }

    public OccupationDTO findById(String id) {

        OccupationEntity occupationEntity = occupationRepository.findById(id).orElseThrow();
        Collection<OccupationEntity> collectionOccupation = new ArrayList<>();
        collectionOccupation.add(occupationEntity);

        return this.convertOccupation(collectionOccupation).get(0);
    }

    public OccupationDTO findByCode(String code) {

        OccupationEntity occupationEntity = occupationRepository.findByCode(code).orElseThrow();
        Collection<OccupationEntity> collectionOccupation = new ArrayList<>();
        collectionOccupation.add(occupationEntity);

        return this.convertOccupation(collectionOccupation).get(0);
    }

    public List<OccupationDTO> findByTitle(String title) {

        return this.convertOccupation(occupationRepository.findByLevelAndTitleContains(LEVEL_OCCUPATION, title));
    }

    public List<OccupationDTO> cleanRelations(List<OccupationDTO> listNOCs) {

        List<OccupationDTO> listOccupations = new ArrayList<>();

        return listNOCs
                .stream()
                .peek(occupationDTO -> {
                    occupationDTO.setNOCs(null);
                    occupationDTO.setOccupationDTO(null);
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<OccupationDTO> convertOccupation(Collection<OccupationEntity> collectionOccupations) {

        return collectionOccupations
                .stream()
                .map(occupationEntity -> {
                    OccupationDTO occupationFather = null;
                    if (occupationEntity.getNocEntity() != null) {
                        occupationFather = new OccupationDTO();
                        BeanUtils.copyProperties(occupationEntity.getNocEntity(), occupationFather);
                    }

                    Collection<OccupationDTO> nocChildren = new ArrayList<>();
                    if (occupationEntity.getNocs().size() > 0) {
                        nocChildren = occupationEntity.getNocs()
                                .stream()
                                .map(e -> {
                                    OccupationDTO occupationDTO = new OccupationDTO();
                                    BeanUtils.copyProperties(e, occupationDTO);
                                    return occupationDTO;
                                })
                                .collect(Collectors.toCollection(ArrayList::new));
                    }

                    OccupationDTO occupationDTO = new OccupationDTO();
                    BeanUtils.copyProperties(occupationEntity, occupationDTO);

                    occupationDTO.setOccupationDTO(occupationFather);
                    occupationDTO.setNOCs(nocChildren);

                    return occupationDTO;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
