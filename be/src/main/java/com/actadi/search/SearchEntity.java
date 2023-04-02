package com.actadi.search;

import com.actadi.common.MasterEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEARCH")
public class SearchEntity extends MasterEntity {

    @Column(name = "ID_PROVINCE")
    private String idProvince;

    @Column(name = "ID_CITY")
    private String idCity;

    @Column(name = "ID_PROGRAM_STREAM")
    private String idProgramStream;

    @Column(name = "ID_EMPLOYER")
    private String idEmployer;

    @Column(name = "ID_NOC")
    private String idNOC;

    public String getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(String idProvince) {
        this.idProvince = idProvince;
    }

    public String getIdCity() {
        return idCity;
    }

    public void setIdCity(String idCity) {
        this.idCity = idCity;
    }

    public String getIdProgramStream() {
        return idProgramStream;
    }

    public void setIdProgramStream(String idProgramStream) {
        this.idProgramStream = idProgramStream;
    }

    public String getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(String idEmployer) {
        this.idEmployer = idEmployer;
    }

    public String getIdNOC() {
        return idNOC;
    }

    public void setIdNOC(String idNOC) {
        this.idNOC = idNOC;
    }
}
