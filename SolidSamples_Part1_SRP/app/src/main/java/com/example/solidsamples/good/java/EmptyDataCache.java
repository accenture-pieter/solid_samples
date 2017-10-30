package com.example.solidsamples.good.java;

import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public class EmptyDataCache implements DataCache<String> {
    @Override
    public List<String> getData() {
        return null;
    }

    @Override
    public void setData(List<String> data) {
        //would normally store this somewhere;
    }
}
