package com.example.solidsamples.good.java;

import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public interface NetworkService<N> {
    List<N> fetchData();
}
