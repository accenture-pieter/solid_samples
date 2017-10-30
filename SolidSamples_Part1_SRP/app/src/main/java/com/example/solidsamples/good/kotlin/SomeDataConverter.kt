package com.example.solidsamples.good.kotlin

import com.example.solidsamples.model.kotlin.SomeDataEntity

/**
 * Created by pieter.snyman on 10/22/17.
 */
interface SomeDataConverter<in N, out M> {
    fun convertData(data: List<N>): List<M>
}

class FirstNameDataConverter : SomeDataConverter<SomeDataEntity, String> {
    override fun convertData(data: List<SomeDataEntity>): List<String> {
        // converting data to full name values
        return data.map { String.format("%s %s", it.name, it.surname) }
    }
}