package com.aliahmed.androidtdd

import org.junit.Assert.*
import org.junit.Test

class EngineTest {

    private val engine = Engine(2000, 189, 15, false)

    @Test
    fun isEngineTurnedOn() {
        engine.turnsOn()

        assertEquals(true, engine.isTurnedOn)
        assertEquals(95, engine.temperature)
    }

    @Test
    fun isEngineTurnedOff(){
        engine.turnsOn()
        engine.turnedOff()

        assertEquals(false, engine.isTurnedOn)
        assertEquals(15, engine.temperature)
    }

}