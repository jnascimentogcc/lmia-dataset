package com.actadi.lmia;

import com.actadi.common.RootBean;

public class LmiaDTO extends RootBean {

    private String province;
    private String programStream;
    private String employer;
    private String occupation;
    private String address;
    private Integer qtyPositions;
    private Integer qtyApproved;
    private Integer year;
    private Integer quarter;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProgramStream() {
        return programStream;
    }

    public void setProgramStream(String programStream) {
        this.programStream = programStream;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
