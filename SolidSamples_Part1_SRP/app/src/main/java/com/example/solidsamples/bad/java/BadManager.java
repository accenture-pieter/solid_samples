package com.example.solidsamples.bad.java;

import com.example.solidsamples.model.java.SomeDataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public class BadManager {

    public List<String> getData() {
        List<String> cachedData = getCachedDataFromDatabase();
        if(cachedData != null) {
            return cachedData;
        }

        List<SomeDataEntity> networkData = fetchDataFromNetwork();
        List<String> convertedData = convertData(networkData);
        cacheDataToDatabase(convertedData);
        return convertedData;
    }

    private List<SomeDataEntity> fetchDataFromNetwork() {
        // mocking some data that we would get from the server
        final List<SomeDataEntity> data = new ArrayList<>();
        data.add(new SomeDataEntity("Jannie", "Van Tonder", "interesting fact about Jannie"));
        data.add(new SomeDataEntity("Sarah", "Du Toit", "interesting fact about Sarah"));
        data.add(new SomeDataEntity("Michael", "Schumacher", "interesting fact about Michael"));
        return data;
    }

    private List<String> convertData(final List<SomeDataEntity> data) {
        // converting data to full name values
        final List<String> result = new ArrayList<>();
        for (final SomeDataEntity entity : data) {
            result.add(String.format("%s %s", entity.getName(), entity.getSurname()));
        }
        return result;
    }

    private void cacheDataToDatabase(List<String> convertedData) {
        //store full names locally (db, sharedpreferences etc.)
    }

    private List<String> getCachedDataFromDatabase() {
        //get cached data from database
        return null;
    }
}
