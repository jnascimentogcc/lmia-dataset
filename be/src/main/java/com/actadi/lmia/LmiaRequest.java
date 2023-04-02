package com.actadi.lmia;

import com.actadi.common.RequestRoot;

public class LmiaRequest extends RequestRoot {

    private String idProvince;
    private String idCity;
    private String idProgramStream;
    private String idEmployer;
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
