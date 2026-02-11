package edu.example.lesson1

fun main() {

    println("=== STEP 1: Numeric operators ===")

    // 1. operaciones matematicas estandar
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1.0 / 2.0)
    println(2.0 * 3.5)

    // 2. inferencia de tipos en operaciones mixtas
    println(6 * 50)       // entero * entero = int
    println(6.0 * 50.0)   // decimal * decimal = double
    println(6.0 * 50)     // decimal * entero = double (kotlin promueve al tipo mayor)

    // 3. metodos de kotlin (todo es un objeto, incluso los numeros)
    println(2.times(3))   // equivalente a 2 * 3
    println(3.5.plus(4))  // equivalente a 3.5 + 4
    println(2.4.div(2))   // equivalente a 2.4 / 2


    println("\n=== STEP 2: Practice using types ===")

    val i: Int = 6
    val b1 = i.toByte() // conversion explicita necesaria para bajar de int a byte
    println(b1)

    val b2: Byte = 1
    println(b2)

    // --- errores comunes ---
    // en kotlin, los numeros pequenios no se convierten automaticamente a grandes.
    // val i1: Int = b2    // error: se esperaba int, se encontro byte
    // val d1: Double = b2 // error: se esperaba double, se encontro byte
    // val s1: String = b2 // error: tipos incompatibles

    // --- forma correcta ---
    // debes usar metodos de conversion explicitos (.totipo)
    val i4: Int = b2.toInt()
    val d2: Double = b2.toDouble()
    val s2: String = b2.toString()

    println(i4)
    println(d2)
    println(s2)

    // formato legible (los guiones bajos son ignorados por el compilador)
    val oneMillion = 1_000_000        // para leer mejor los millones
    val socialSecurityNumber = 999_99_9999L // la 'l' indica long (64 bits)
    val hexBytes = 0xFF_EC_DE_5E      // hexadecimal
    val binaryBytes = 0b11010010_01101001_10010100_10010010 // binario

    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(binaryBytes)


    println("\n=== STEP 3: Value of variable types ===")

    // 'var' define una variable mutable (puede cambiar)
    var fish = 1
    fish = 2
    println(fish)

    // 'val' define una variable inmutable (constante, solo lectura)
    val aquarium = 1
    // la siguiente linea causaria error de compilacion:
    // aquarium = 2

    // declaracion explicita del tipo de dato
    var lakes: Double = 2.5
    println(lakes)


    println("\n=== STEP 4: strings and characters ===")

    val numberOfFish = 5
    val numberOfPlants = 12

    // plantillas de string (string templates) usando '$'
    val message1 = "I have $numberOfFish fish and $numberOfPlants plants"
    println(message1)

    // expresiones dentro de strings usando '${}' para operaciones matematicas
    val message2 = "I have ${numberOfFish + numberOfPlants} fish and plants"
    println(message2)
}