package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class AdditionTest {
    lateinit var calculator:Calculator
    lateinit var addition:Addition
    @Before
    fun setUp(){
        calculator=Calculator()
        addition=Addition()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun processCalculations() {
        assertEquals(listOf(8.0,9.0),addition.processCalculations(values = mutableListOf(4.0,5.0),modifier = 4.0))


    }
}