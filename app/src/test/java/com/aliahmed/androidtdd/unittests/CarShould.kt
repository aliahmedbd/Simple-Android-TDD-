package com.aliahmed.androidtdd.unittests

import com.aliahmed.androidtdd.Car
import junit.framework.Assert.assertEquals
import org.junit.Test

class CarShould {

    val car = Car(fuel = 5.0)

    @Test
    fun loosingFuelWhenTurnsOn(){
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }

}