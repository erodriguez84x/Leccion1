package edu.example.candymachine
import java.util.Scanner //teclado

fun main() {
    val reader = Scanner(System.`in`)

    val cashRegister = CashRegister()
    val candy = Dispenser(100, 50)
    val chips = Dispenser(100, 65)
    val gum = Dispenser(75, 45)
    val cookies = Dispenser(100, 85)

    var choice: Int

    while (true) {
        showSelection()
        choice = reader.nextInt()

        if (choice == 9) break

        when (choice) {
            1 -> sellProduct(candy, cashRegister, reader)
            2 -> sellProduct(chips, cashRegister, reader)
            3 -> sellProduct(gum, cashRegister, reader)
            4 -> sellProduct(cookies, cashRegister, reader)
            else -> println("Invalid Selection")
        }
    }
}

fun showSelection() {
    println("\n ******* Welcome to Candy Machine ******")
    println("To select an item, enter")
    println("1 for Candy\n2 for Chips\n3 for Gum\n4 for Cookies\n9 to Exit")
    print("Selection: ")
}

fun sellProduct(product: Dispenser, cash: CashRegister, reader: Scanner) {
    if (product.getCount() > 0) {
        println("Cost: $ ${product.getProductCost()} cents. Please deposit money:")
        val coins = reader.nextInt()

        if (coins >= product.getProductCost()) {
            product.makeSale()
            cash.acceptAmount(product.getProductCost())
            println("Collect your item at the bottom and enjoy! Your change is $ ${coins - product.getProductCost()}")
        } else {
            println("Not enough money.")
        }
    } else {
        println("Sorry, this item is sold out.")
    }
}