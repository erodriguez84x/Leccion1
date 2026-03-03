package edu.example.actividad3

fun main() {
    println("--- Iniciando Verificacion -----------")

    //instanciacion
    val libroClasico = Libro("Don Quijote de la Mancha", 1605)
    val libroModerno = Libro("Cien años de soledad", 1967)

    //herencia y abstracción
    println("\n--- Prueba de Herencia y Abstraccion -----------")
    println("Título: ${libroClasico.titulo}")
    println("Anio de publicacion: ${libroClasico.anioPublicacion}")

    //interfaz
    println("\n--- Prueba de Interfaz -----------")
    libroClasico.prestar()

    //funcion de extension
    println("\n--- Prueba de Funcion de Extension -----------")
    println("¿El libro '${libroClasico.titulo}' es antiguo? ${libroClasico.esAntiguo()}")
    println("¿El libro '${libroModerno.titulo}' es antiguo? ${libroModerno.esAntiguo()}")

    // Companion Object
    println("\n--- Prueba del Companion Object -----------")
    println("Constante TIPO_RECURSO: ${Libro.TIPO_RECURSO}")
}