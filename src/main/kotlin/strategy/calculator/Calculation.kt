package strategy.calculator

interface Calculation{

    fun processCalculations(values: List<Double>, modifier: Double): List<Double>
}