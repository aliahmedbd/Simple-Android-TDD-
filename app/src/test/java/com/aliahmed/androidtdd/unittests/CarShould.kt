package com.aliahmed.androidtdd.unittests

import com.aliahmed.androidtdd.Car
import com.aliahmed.androidtdd.Engine
import com.nhaarman.mockitokotlin2.mock
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify

class CarShould {

    private val engine: Engine = mock()
    private val car = Car(fuel = 5.0, engine)

    @Test
    fun loosingFuelWhenTurnsOn() {
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine() {
        car.turnOn()

        verify(engine, times(1)).turnsOn()
    }


}