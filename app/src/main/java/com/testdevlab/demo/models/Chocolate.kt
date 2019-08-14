package com.testdevlab.demo.models

data class Chocolate (private val size: Int,private val taste: String) {
    var melted:Boolean = false

    fun getTaste(): String {
        return taste
    }
}