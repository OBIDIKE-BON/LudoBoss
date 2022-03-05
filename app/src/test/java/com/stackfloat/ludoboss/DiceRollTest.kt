package com.stackfloat.ludoboss

import org.junit.Assert.*
import org.junit.Test

class DiceRollTest{
    @Test
    fun testRollResult(){
        assertTrue("the result is not a valid dice side (1-6) ",
            Dice(6).roll() in 1..6)
    }
}