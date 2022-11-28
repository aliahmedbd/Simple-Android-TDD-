package com.aliahmed.androidtdd.acceptancetest

import com.aliahmed.androidtdd.Car
import junit.framework.Assert.assertEquals
import org.junit.Test

class CarFeature  {

    val car = Car(6.0)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn(){

        car.turnOn()

        assertEquals(5.5, car.fuel)
    }
}