package com.example.solidsamples.bad.kotlin

import com.example.solidsamples.model.kotlin.SomeDataEntity

/**
 * Created by pieter.snyman on 10/22/17.
 */

class BadManager {

    val data: List<String>
        get() {
            cachedDataFromDatabase()?.let {
                return it
            }

            val networkData = fetchDataFromNetwork()
            val convertedData = convertData(networkData)
            cacheDataToDatabase(convertedData)
            return convertedData
        }

    private fun fetchDataFromNetwork(): List<SomeDataEntity> {
        // mocking some data that we would get from the server
        return listOf(
                SomeDataEntity("Jannie", "Van Tonder", "interesting fact about Jannie"),
                SomeDataEntity("Sarah", "Du Toit", "interesting fact about Sarah"),
                SomeDataEntity("Michael", "Schumacher", "interesting fact about Michael"))
    }

    private fun convertData(data: List<SomeDataEntity>): List<String> {
        // converting data to full name values
        return data.map { String.format("%s %s", it.name, it.surname) }
    }

    private fun cachedDataFromDatabase() : List<String>? {
        //get cached data from database
        return null
    }

    private fun cacheDataToDatabase(convertedData: List<String>) {
        //store full names locally (db, sharedpreferences etc.)
    }
}
