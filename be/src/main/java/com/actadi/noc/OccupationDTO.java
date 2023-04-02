package com.actadi.noc;

import com.actadi.common.RootBean;

import java.util.ArrayList;
import java.util.Collection;

public class OccupationDTO extends RootBean {

    private String id;
    private Collection<OccupationDTO> NOCs = new ArrayList<>();
    private OccupationDTO occupationDTO;
    private Integer level;
    private String code;
    private String title;
    private String definition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<OccupationDTO> getNOCs() {
        return NOCs;
    }

    public void setNOCs(Collection<OccupationDTO> NOCs) {
        this.NOCs = NOCs;
    }

    public OccupationDTO getOccupationDTO() {
        return occupationDTO;
    }

    public void setOccupationDTO(OccupationDTO occupationEntity) {
        this.occupationDTO = occupationEntity;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
