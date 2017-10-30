package com.example.solidsamples.good.kotlin

import com.example.solidsamples.model.kotlin.SomeDataEntity

/**
 * Created by pieter.snyman on 10/22/17.
 */
interface NetworkService<T> {
    fun fetchData(): List<T>
}

class SomeDataNetworkService : NetworkService<SomeDataEntity> {
    override fun fetchData(): List<SomeDataEntity> {
        // mocking some data that we would get from the server
        return listOf(
                SomeDataEntity("Jannie", "Van Tonder", "interesting fact about Jannie"),
                SomeDataEntity("Sarah", "Du Toit", "interesting fact about Sarah"),
                SomeDataEntity("Michael", "Schumacher", "interesting fact about Michael"))
    }
}
