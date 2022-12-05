package com.aliahmed.androidtdd.acceptancetest

import com.aliahmed.androidtdd.Car
import com.aliahmed.androidtdd.Engine
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class CarFeature {

    private val engine = Engine(2000, 189, 15, false)
    private val car = Car(6.0, engine)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {

        car.turnOn()

        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() {
        car.turnOn()

        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}