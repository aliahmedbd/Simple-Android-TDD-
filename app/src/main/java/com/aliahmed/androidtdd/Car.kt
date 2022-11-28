package com.aliahmed.androidtdd

class Car(var fuel : Double, var engine : Engine) {

    fun turnOn() {
        fuel -=0.5
        engine.turnsOn()
    }


}