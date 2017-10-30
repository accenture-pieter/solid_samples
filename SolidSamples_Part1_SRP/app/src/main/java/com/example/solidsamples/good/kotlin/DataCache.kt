package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 10/22/17.
 */
interface DataCache<T> {
    var data: List<T>?
}

class EmptyDataCache : DataCache<String> {
    override var data: List<String>? = null
}