package com.example.solidsamples.good.java;

import java.util.List;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public class BetterManager<N, M> {

    private final NetworkService<N> networkService;
    private final SomeDataConverter<N, M> dataConverter;
    private final DataCache<M> cache;

    public BetterManager(final NetworkService<N> networkService, final SomeDataConverter<N, M> dataConverter, final DataCache<M> cache) {
        this.networkService = networkService;
        this.dataConverter = dataConverter;
        this.cache = cache;
    }

    public List<M> getData() {
        List<M> cachedData = cache.getData();
        if (cachedData != null) {
            return cachedData;
        }

        List<N> networkData = networkService.fetchData();
        List<M> convertedData = dataConverter.convertData(networkData);
        cache.setData(convertedData);
        return convertedData;
    }
}
