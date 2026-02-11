package edu.example.aspectosbasicoskotlin

fun main(){
    println("step 1: variables nulas ----------------")

    // declaracion de variables que aceptan nulos
    // var rocks: Int = null // esto daria error de compilacion
    var marbles: Int? = null
    println("valor inicial: $marbles")

    println("step 2: control de nulos ----------------")

    // ejemplo 1: verificacion estandar con if (estilo java)
    var fishFood = 10 // cambiamos el valor a 10
    if (fishFood != null) {
        fishFood = fishFood.dec() // reduce el numero en 1
        println("comida restante (if): $fishFood")
    }

    // ejemplo 2: manejo seguro con elvis operator (estilo kotlin)
    var fishFood2: Int? = 10

    // el signo de interrogacion verifica si es nulo antes de restar
    // el operador elvis ?: asigna 0 si el resultado es nulo
    fishFood2 = fishFood2?.dec() ?: 0
    println("comida restante (elvis): $fishFood2")

    // cuidado con la doble admiracion !!
    // val s: String? = null
    // val len = s!!.length   // esto lanzaria una excepcion (crash) si s es nulo
}