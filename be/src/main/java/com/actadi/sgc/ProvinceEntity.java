package com.actadi.sgc;

import com.actadi.common.MasterEntity;
import com.actadi.noc.OccupationEntity;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "PROVINCE")
public class ProvinceEntity extends MasterEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
