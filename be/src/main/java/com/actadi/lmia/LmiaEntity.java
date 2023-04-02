package com.actadi.lmia;

import com.actadi.common.MasterEntity;
import com.actadi.employer.EmployerEntity;
import com.actadi.noc.OccupationEntity;
import com.actadi.program.ProgramStreamEntity;
import com.actadi.sgc.CityEntity;
import com.actadi.sgc.ProvinceEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "LMIA")
public class LmiaEntity extends MasterEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PROVINCE")
    private ProvinceEntity provinceEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CITY")
    private CityEntity cityEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PROGRAM_STREAM")
    private ProgramStreamEntity programStreamEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_EMPLOYER")
    private EmployerEntity employerEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_NOC")
    private OccupationEntity occupationEntity;

    @Column(name = "QTY_POSITIONS", nullable = false)
    private Integer qtyPositions;

    @Column(name = "QTY_APPROVED", nullable = false)
    private Integer qtyApproved;

    @Column(name = "YEAR", nullable = false)
    private Integer year;

    @Column(name = "QUARTER", nullable = false)
    private Integer quarter;

    public ProvinceEntity getProvinceEntity() {
        return provinceEntity;
    }

    public void setProvinceEntity(ProvinceEntity provinceEntity) {
        this.provinceEntity = provinceEntity;
    }

    public CityEntity getCityEntity() {
        return cityEntity;
    }

    public void setCityEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    public ProgramStreamEntity getProgramStreamEntity() {
        return programStreamEntity;
    }

    public void setProgramStreamEntity(ProgramStreamEntity programStreamEntity) {
        this.programStreamEntity = programStreamEntity;
    }

    public EmployerEntity getEmployerEntity() {
        return employerEntity;
    }

    public void setEmployerEntity(EmployerEntity employerEntity) {
        this.employerEntity = employerEntity;
    }

    public OccupationEntity getOccupationEntity() {
        return occupationEntity;
    }

    public void setOccupationEntity(OccupationEntity occupationEntity) {
        this.occupationEntity = occupationEntity;
    }

    public Integer getQtyPositions() {
        return qtyPositions;
    }

    public void setQtyPositions(Integer qtyPositions) {
        this.qtyPositions = qtyPositions;
    }

    public Integer getQtyApproved() {
        return qtyApproved;
    }

    public void setQtyApproved(Integer qtyApproved) {
        this.qtyApproved = qtyApproved;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }
}
