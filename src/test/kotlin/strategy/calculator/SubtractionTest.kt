package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import strategy.calculator.calculations.Subtraction

class SubtractionTest {
    lateinit var calculation: Calculation
    @Before
    fun setUp(){
        calculation=Subtraction()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun processCalculations() {
        assertEquals(listOf(0.0,1.0),calculation.processCalculations(values = mutableListOf(4.0,5.0),modifier = 4.0))


    }
}