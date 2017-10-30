package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 10/22/17.
 */

class BetterManager<N, out M>(private val networkService: NetworkService<N>,
                              private val dataConverter: SomeDataConverter<N, M>,
                              private val cache: DataCache<M>) {
    val data: List<M>
        get() {
            cache.data?.let {
                return it
            }

            val networkData = networkService.fetchData()
            val convertedData = dataConverter.convertData(networkData)
            cache.data = convertedData
            return convertedData
        }
}
