package edu.example.aspectosbasicoskotlin

fun main() {

    println("=== STEP 1: Numeric operators ===")

    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1.0 / 2.0)
    println(2.0 * 3.5)

    println(6 * 50)
    println(6.0 * 50.0)
    println(6.0 * 50)

    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))


    println("\n=== STEP 2: Practice using types ===")

    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1
    println(b2)

    val i4: Int = b2.toInt()
    val d2: Double = b2.toDouble()
    val s2: String = b2.toString()

    println(i4)
    println(d2)
    println(s2)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val binaryBytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(binaryBytes)


    println("\n=== STEP 3: Value of variable types ===")

    var fish = 1
    fish = 2
    println(fish)

    val aquarium = 1

    var lakes: Double = 2.5
    println(lakes)


    println("\n=== STEP 4: strings and characters ===")

    val numberOfFish = 5
    val numberOfPlants = 12

    val message1 = "I have $numberOfFish fish and $numberOfPlants plants"
    println(message1)

    val message2 = "I have ${numberOfFish + numberOfPlants} fish and plants"
    println(message2)
}