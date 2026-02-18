package edu.example.leccion2_funciones

import java.util.*

// --- Paso 1: Crear un valor predeterminado para un parámetro
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

// --- Paso 2: Agregar los parámetros requeridos
/*
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}
*/

// --- Paso 3: Crear funciones compactas y refactorizar
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

//  usando las funciones compactas
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun randomDay2(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood2(day: String): String {
    return "pellets"
}

fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun main(args: Array<String>) {
    //Paso 1
    swim()
    swim("slow")
    swim(speed = "turtle-like")

    // Paso 3
    feedTheFish2()
}