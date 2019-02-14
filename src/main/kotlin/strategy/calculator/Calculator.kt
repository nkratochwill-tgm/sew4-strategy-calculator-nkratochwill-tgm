package strategy.calculator

import java.*
import java.util.*

class Calculator {
    private var values: MutableList<Double> = mutableListOf()
    private var modifier: Double = 0.0
    private var calculation:Calculation?=null

    fun addValue(value: Double) {
        values.add(value)
    }

    fun removeValue(value: Double) {
        values.remove(value)
    }

    fun setModifier(modifier: Double) {
        this.modifier = modifier
    }

    fun processCalculation(): List<Double>? {
        return calculation?.processCalculations(values, modifier)
    }

    fun setCalculation(calculation: Calculation) {
        this.calculation = calculation
    }

    override fun toString(): String {
        return "Calculator(values=$values, modifier=$modifier, calculation=$calculation)"
    }


}