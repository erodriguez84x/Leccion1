package edu.example.leccion2_funciones

fun main(args: Array<String>) {

    //---1
    println("Hello, world!")

    //---2
    val isUnit = println("This is an expression")
    println(isUnit)

    //---3
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    //---4
    val temperature2 = 10
    val message = "The water temperature is ${ if (temperature2 > 50) "too warm" else "OK" }."
    println(message)

}
