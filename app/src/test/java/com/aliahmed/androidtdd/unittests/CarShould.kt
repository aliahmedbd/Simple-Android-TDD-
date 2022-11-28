package com.aliahmed.androidtdd.unittests

import com.aliahmed.androidtdd.Car
import com.aliahmed.androidtdd.Engine
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class CarShould {

    private val engine = Engine(2000, 189, 15, false)
    val car = Car(fuel = 5.0, engine)

    @Test
    fun loosingFuelWhenTurnsOn(){
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }

    @Test
    fun increaseEngineTemperatureWhenTurnsOn(){
        car.turnOn()

        assertEquals(95, car.engine.temperature)
    }

    @Test
    fun turnOnEngineTWhenTurnsOn(){
        car.turnOn()

        assertTrue(engine.isTurnedOn)
    }



}