package edu.example.candymachine

class CashRegister(cashIn: Int = 500) {
    var cashOnHand: Int = if (cashIn >= 0) cashIn else 500
        private set

    fun currentBalance() = cashOnHand
    fun acceptAmount(amountIn: Int) { cashOnHand += amountIn }
}