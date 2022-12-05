package com.aliahmed.androidtdd.unittests

import com.aliahmed.androidtdd.Engine
import org.junit.Assert.*
import org.junit.Test

class EngineShould {

    private val engine = Engine()

    @Test
    fun isEngineTurnedOn() {
        engine.turnsOn()

        //I can use assertTrue here
        assertEquals(true, engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn(){
        engine.turnsOn()

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