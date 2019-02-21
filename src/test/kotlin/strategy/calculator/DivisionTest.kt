package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import strategy.calculator.calculations.Division

class DivisionTest {
    lateinit var calculation: Calculation
    @Before
    fun setUp(){
        calculation=Division()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun processCalculations() {
        assertEquals(listOf(1.0,1.25),calculation.processCalculations(values = mutableListOf(4.0,5.0),modifier = 4.0))


    }
}