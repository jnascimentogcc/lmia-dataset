package com.actadi.common;

import com.google.gson.Gson;

public abstract class RootBean {

    @Override
    public String toString() {

        return new Gson().toJson(this);
    }

}
