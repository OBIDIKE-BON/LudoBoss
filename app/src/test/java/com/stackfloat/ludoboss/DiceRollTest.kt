package com.stackfloat.ludoboss

import org.junit.Assert.*
import org.junit.Test

class DiceRollTest{
    @Test
    fun testRollResult(){
        val dice = Dice(6)
        assertTrue("the result is not a valid dice side (1-6) ",
            dice.roll() in 1..dice.numSides)
    }
}