package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import strategy.calculator.calculations.Addition

class AdditionTest {
    lateinit var calculation: Calculation
    @Before
    fun setUp(){
        calculation=Addition()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun processCalculations() {
        assertEquals(listOf(8.0,9.0),calculation.processCalculations(values = mutableListOf(4.0,5.0),modifier = 4.0))


    }
}