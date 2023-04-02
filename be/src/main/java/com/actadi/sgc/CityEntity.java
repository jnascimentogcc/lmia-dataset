package com.actadi.sgc;

import com.actadi.common.MasterEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITY")
public class CityEntity extends MasterEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ID_PROVINCE")
    private String idProvince;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(String idProvince) {
        this.idProvince = idProvince;
    }
}
