package edu.example.actividad3

fun main() {
    println("----------- Iniciando verificacion -----------")

    //instanciacion
    val libroClasico = Libro("Don Quijote de la Mancha", 1605)
    val libroModerno = Libro("Cien anios de soledad", 1967)

    //herencia y abstracción
    println("Título: ${libroClasico.titulo}")
    println("Anio de publicacion: ${libroClasico.anioPublicacion}")

    //interfaz
    libroClasico.prestar()

    //funcion de extension
    println("¿El libro '${libroClasico.titulo}' es antiguo? ${libroClasico.esAntiguo()}")
    println("¿El libro '${libroModerno.titulo}' es antiguo? ${libroModerno.esAntiguo()}")

    //companion object
    println("Constante TIPO_RECURSO: ${Libro.TIPO_RECURSO}")
}