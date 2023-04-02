package com.actadi.employer;

import com.actadi.common.RequestRoot;

public class EmployerRequest extends RequestRoot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
