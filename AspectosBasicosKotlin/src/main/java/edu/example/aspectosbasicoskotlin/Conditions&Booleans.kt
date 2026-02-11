package edu.example.aspectosbasicoskotlin

fun main() {
    val numberOfFish = 50
    val numberOfPlants = 23

    // comparacion basica
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    // rango de 1 a 100
    if (numberOfFish in 1..100) {
        println(numberOfFish)
    }

    // if - else if - else
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    // estructura when
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}