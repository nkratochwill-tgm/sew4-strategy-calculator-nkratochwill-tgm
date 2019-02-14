package strategy.calculator

class Addition:Calculation {

    override fun processCalculations(values: List<Double>, modifier: Double): List<Double> {
        val retList: MutableList<Double> = ArrayList()
        retList.forEach { retList.add(it + modifier) }
        return retList
    }
}