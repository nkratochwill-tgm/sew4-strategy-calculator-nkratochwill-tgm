package strategy.calculator

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {
    lateinit var calculator:Calculator
    @Before
    fun setUp() {
        calculator=Calculator()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun addOneProperDoubleValue() {
        calculator.addValue(42.0)
    }

    @Test
    fun addTwoProperDoubleValue() {
        val firstValue=42.0
        val secondValue=84.1231
        calculator.addValue(firstValue)
        calculator.addValue(secondValue)

        val checkList= ArrayList<Double>()
        checkList.add(firstValue)
        checkList.add(secondValue)
        //assertTrue(calculator.toString().contains());
    }

    @Test
    fun addOneIntegerValue() {
        calculator.addValue(Integer.MAX_VALUE.toDouble())
        assertTrue(calculator.toString().contains("${Integer.MAX_VALUE.toDouble()}]"))
    }
    @Test
    fun removeValue() {
    }

    @Test
    fun processCalculation() {
    }

    @Test
    fun getValues() {
    }

    @Test
    fun setValues() {
    }

    @Test
    fun getModifier() {
    }

    @Test
    fun setModifier() {
    }

    @Test
    fun getCalculation() {
    }

    @Test
    fun setCalculation() {
    }
}