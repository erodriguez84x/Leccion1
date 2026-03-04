package edu.example.candymachine
class Dispenser(setNoOfItems: Int = 50, setCost: Int = 50) {
    var numberOfItems: Int = if (setNoOfItems >= 0) setNoOfItems else 50
        private set
    var cost: Int = if (setCost >= 0) setCost else 50
        private set
    fun getCount(): Int = numberOfItems

    fun getProductCost(): Int = cost

    fun makeSale() {
        if (numberOfItems > 0) {
            numberOfItems--
        }
    }
}