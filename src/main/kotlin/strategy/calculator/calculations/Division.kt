package strategy.calculator.calculations

import strategy.calculator.Calculation

class Division: Calculation {

    override fun processCalculations(values: List<Double>, modifier: Double): List<Double> {
        val retList: MutableList<Double> = ArrayList()
        values.forEach { retList.add(it / modifier) }
        return retList
    }
}