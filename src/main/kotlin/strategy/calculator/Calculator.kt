package strategy.calculator

import java.*
import java.util.*

class Calculator {
    private var values: MutableList<Double> = mutableListOf()
    private var modifier: Double = 0.0
    private var calculation: Calculation? = null

    fun addValue(value: Double) {
        this.values.add(value)
    }

    fun removeValue(value: Double) {
        this.values.remove(value)
    }

    fun processCalculation(): List<Double> {
        return calculation!!.processCalculations(values, modifier)
    }

    override fun toString(): String {
        return "" + values + modifier + calculation
    }

}