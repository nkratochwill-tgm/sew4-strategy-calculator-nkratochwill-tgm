package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import strategy.calculator.calculations.Multiplication

class MultiplicationTest {
    lateinit var calculation: Calculation
    @Before
    fun setUp(){
        calculation=Multiplication()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun processCalculations() {
        assertEquals(listOf(16.0,20.0),calculation.processCalculations(values = mutableListOf(4.0,5.0),modifier = 4.0))


    }
}