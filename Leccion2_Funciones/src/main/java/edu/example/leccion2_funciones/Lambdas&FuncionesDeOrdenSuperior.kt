package edu.example.leccion2_funciones

fun main() {
    println("Taller: Laboratorio de automatizacion")

    // --- Paso 1: lista de instrumentos ---
    val instrumentos = listOf(
        Pair("Osciloscopio Digital", 1500.0),
        Pair("Voltimetro Digital", 120.0),
        Pair("Generador de Ondas", 980.0),
        Pair("Cable BNC", 15.0),
        Pair("Resistencia 1k", 0.10),
        Pair("Protoboard", 25.0)
    )

    println("\n--- Lista completa de instrumentos ---")
    instrumentos.forEach { println("${it.first} -> ${it.second}") }

    // --- Paso 2: filter (filtrar instrumentos > 100)
    val costosos = instrumentos.filter { it.second > 100 }
    println("\nInstrumentos costosos (> 100):")
    costosos.forEach { println("${it.first}: $${it.second}") }

    // --- Paso 3: map
    val frasesPrecios = instrumentos.map { "${it.first} cuesta ${it.second}" }
    println("\nNombres y costos (Map):")
    frasesPrecios.forEach { println(it) }

    // --- Paso 4: sumof , total de instrumentos > 100
    val totalCostosos = instrumentos.filter { it.second > 100 }.sumOf { it.second }
    println("\nCosto total de instrumentos (> 100): $$totalCostosos")

    // --- Paso 5: sortedbydescending (mayor a menor) ---
    val ordenadosMayorAMenor = instrumentos.sortedByDescending { it.second }
    println("\nInstrumentos ordenados por precio (Mayor a Menor):")
    ordenadosMayorAMenor.forEach { println("${it.first} - ${it.second}") }

    // --- Paso 6: filtrar cables ---
    val soloCables = filtrarInstrumentos(instrumentos) { it.first.contains("Cable") }
    println("\nFiltro (Cables):")
    soloCables.forEach { println(it.first) }

    // --- Paso 7: transformar a precios ---
    val soloPrecios = transformarInstrumentos(instrumentos) { it.second }
    println("\nLista de puros precios extraidos: $soloPrecios")

    // --- Paso 8: calculo total de instrumentos de medicion ---
    val totalMedicion = calcular(instrumentos) { lista ->
        lista.filter { it.first.contains("Osciloscopio") || it.first.contains("Voltimetro") }
            .sumOf { it.second }
    }
    println("\nTotal solo instrumentos de medicion: $$totalMedicion")

    // --- reto final: buscar el primero ---
    val primeroCaro = buscarPrimero(instrumentos) { it.second > 1000 }
    println("\nPrimer instrumento que cuesta mas de 1000: ${primeroCaro?.first ?: "No encontrado"}")
}

// --- funciones de orden superior ---

fun filtrarInstrumentos(
    lista: List<Pair<String, Double>>,
    criterio: (Pair<String, Double>) -> Boolean
): List<Pair<String, Double>> {
    return lista.filter(criterio)
}

fun <T> transformarInstrumentos(
    lista: List<Pair<String, Double>>,
    transformacion: (Pair<String, Double>) -> T
): List<T> {
    return lista.map(transformacion)
}

fun calcular(
    lista: List<Pair<String, Double>>,
    operacion: (List<Pair<String, Double>>) -> Double
): Double {
    return operacion(lista)
}

fun buscarPrimero(
    lista: List<Pair<String, Double>>,
    criterio: (Pair<String, Double>) -> Boolean
): Pair<String, Double>? {
    return lista.firstOrNull(criterio)
}