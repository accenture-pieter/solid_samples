package com.example.solidsamples.good.java;

import com.example.solidsamples.model.java.SomeDataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public class SomeDataNetworkService implements NetworkService<SomeDataEntity> {
    @Override
    public List<SomeDataEntity> fetchData() {
        // mocking some data that we would get from the server
        final List<SomeDataEntity> data = new ArrayList<>();
        data.add(new SomeDataEntity("Jannie", "Van Tonder", "interesting fact about Jannie"));
        data.add(new SomeDataEntity("Sarah", "Du Toit", "interesting fact about Sarah"));
        data.add(new SomeDataEntity("Michael", "Schumacher", "interesting fact about Michael"));
        return data;
    }
}
