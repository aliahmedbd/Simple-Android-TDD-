package com.aliahmed.androidtdd

class Engine(
    val cc: Int,
    val horsePower: Int,
    var temperature: Int,
    var isTurnedOn: Boolean = false
) {
    fun turnsOn(){
        isTurnedOn = true
        temperature = 95
    }

    fun turnedOff(){
        isTurnedOn = false
        temperature = 15
    }
}