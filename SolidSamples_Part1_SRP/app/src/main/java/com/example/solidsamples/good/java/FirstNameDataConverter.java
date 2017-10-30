package com.example.solidsamples.good.java;

import com.example.solidsamples.model.java.SomeDataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public class FirstNameDataConverter implements SomeDataConverter<SomeDataEntity, String> {
    @Override
    public List<String> convertData(List<SomeDataEntity> data) {
        // converting data to full name values
        final List<String> result = new ArrayList<>();
        for (final SomeDataEntity entity : data) {
            result.add(String.format("%s %s", entity.getName(), entity.getSurname()));
        }
        return result;
    }
}
