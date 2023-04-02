package com.actadi.noc;

import com.actadi.common.MasterEntity;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "NOC")
public class OccupationEntity extends MasterEntity {

    @OneToMany(mappedBy = "occupationEntity", fetch = FetchType.EAGER)
    private Collection<OccupationEntity> nocs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_NOC")
    private OccupationEntity occupationEntity;

    @Column(name = "LEVEL", nullable = false)
    private Integer level;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DEFINITION", nullable = false)
    private String definition;

    public Collection<OccupationEntity> getNocs() {
        return nocs;
    }

    public void setNocs(Collection<OccupationEntity> nocs) {
        this.nocs = nocs;
    }

    public OccupationEntity getNocEntity() {
        return occupationEntity;
    }

    public void setNocEntity(OccupationEntity occupationEntity) {
        this.occupationEntity = occupationEntity;
    }

    public OccupationEntity getOccupationEntity() {
        return occupationEntity;
    }

    public void setOccupationEntity(OccupationEntity occupationEntity) {
        this.occupationEntity = occupationEntity;
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
