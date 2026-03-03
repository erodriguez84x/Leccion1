package edu.example.actividad3

fun main() {
    println("--- Iniciando Verificacion -----------")

    // Paso 1: Instanciación
    val libroClasico = Libro("Don Quijote de la Mancha", 1605)
    val libroModerno = Libro("Cien años de soledad", 1967)

    // Paso 2: Prueba de Herencia y Abstracción
    println("\n--- Prueba de Herencia y Abstraccion -----------")
    println("Título: ${libroClasico.titulo}")
    println("Anio de publicacion: ${libroClasico.anioPublicacion}")

    // Paso 3: Prueba de Interfaz
    println("\n--- Prueba de Interfaz -----------")
    libroClasico.prestar()

    // Paso 4: Prueba de Función de Extensión
    println("\n--- Prueba de Funcion de Extension -----------")
    println("¿El libro '${libroClasico.titulo}' es antiguo? ${libroClasico.esAntiguo()}")
    println("¿El libro '${libroModerno.titulo}' es antiguo? ${libroModerno.esAntiguo()}")

    // Paso 5: Prueba del Companion Object
    println("\n--- Prueba del Companion Object -----------")
    println("Constante TIPO_RECURSO: ${Libro.TIPO_RECURSO}")
}