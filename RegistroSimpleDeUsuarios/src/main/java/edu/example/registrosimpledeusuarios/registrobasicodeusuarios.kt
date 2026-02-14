package edu.example.registrosimpledeusuarios

fun main() {
    val nombre: String = "Alex"
    var edad: Int = 25
    val email: String? = null
    val estaSuscrito: Boolean = true

    println("registro de usuario")
    println("nombre: $nombre")

    if (esMayorDeEdad(edad)) {
        println("estado: acceso permitido")
    } else {
        println("estado: acceso denegado")
    }

    val correoAMostrar = email ?: "email no registrado"
    println("contacto: $correoAMostrar")

    val categoria = when (edad) {
        in 0..12 -> "nino"
        in 13..17 -> "adolescente"
        in 18..64 -> "adulto"
        else -> "adulto mayor"
    }
    println("categoria: $categoria")

    println("---------------------------")

    val listaUsuarios: MutableList<String> = mutableListOf("Argenis", "Raul", "Nicolas")

    listaUsuarios.add("Roberto")
    listaUsuarios.add(nombre)

    println("usuarios registrados:")
    for (usuario in listaUsuarios) {
        println("- $usuario")
    }
}
fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}