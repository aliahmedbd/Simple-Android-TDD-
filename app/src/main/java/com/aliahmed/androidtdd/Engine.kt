package com.aliahmed.androidtdd

class Engine(
    val cc: Int = 2000,
    val horsePower: Int = 189,
    var temperature: Int = 15,
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