package edu.example.actividad4

data class Habitat(
    val tipo: String,
    val temperaturaPromedio: Double,
    val region: String
)

data class Cuidador(
    val nombre: String,
    val aniosExperiencia: Int,
    val especialidad: String
)

data class Origen(
    val pais: String,
    val region: String,
    val productor: String
)

data class InformacionNutricional(
    val calorias: Double,
    val azucar: Double,
    val fibra: Double,
    val proteinas: Double
)


interface Comestible {
    fun formaDeComer()
    fun caloriasAportadas()
}


abstract class Animal(
    val nombre: String,
    val edad: Int,
    val peso: Double,
    val habitat: Habitat,
    val cuidador: Cuidador
) {
    abstract fun hacerSonido()
    abstract fun mostrarInfo()
}

abstract class Fruta(
    val nombre: String,
    val color: String,
    val peso: Double,
    val nivelDulzura: Int,
    val origen: Origen,
    val informacionNutricional: InformacionNutricional
) : Comestible {

    fun tipoSabor(): String = when (nombre.lowercase()) {
        "manzana", "platano" -> "Dulce"
        "naranja" -> "Citrico"
        "limon" -> "Acido"
        else -> "Sabor no definido"
    }

    fun mostrarDetalles() {
        println("FRUTA: ${nombre.uppercase()}")
        println("  > Color: $color")
        println("  > Sabor: ${tipoSabor()}")
        println("  > Origen: ${origen.pais}")
        print("  > Forma de comer: "); formaDeComer()
        print("  > Calorias: "); caloriasAportadas()
    }
}


class Leon(
    edad: Int,
    peso: Double,
    habitat: Habitat,
    cuidador: Cuidador
) : Animal("Leon", edad, peso, habitat, cuidador) {


    override fun hacerSonido() = println("Rugido")

    override fun mostrarInfo() {
        println("ANIMAL: ${nombre.uppercase()}")
        println("  > Edad: $edad anios")
        println("  > Peso: $peso kg")
        println("  > Habitat: ${habitat.tipo}")
        print("  > Sonido: "); hacerSonido()
        println("  > Comestible: No")
    }
}

class Gallina(
    edad: Int,
    peso: Double,
    habitat: Habitat,
    cuidador: Cuidador
) : Animal("Gallina", edad, peso, habitat, cuidador), Comestible {

    override fun hacerSonido() = println("Cacareo")
    override fun formaDeComer() = println("Asada, horneada, frita")
    override fun caloriasAportadas() = println("2390 kcal por un kg")

    override fun mostrarInfo() {
        println("ANIMAL: ${nombre.uppercase()}")
        println("  > Edad: $edad anios")
        println("  > Peso: $peso kg")
        println("  > Habitat: ${habitat.tipo}")
        print("  > Sonido: "); hacerSonido()
        println("  > Comestible: Si")
        print("  > Forma de comer: "); formaDeComer()
        print("  > Calorias: "); caloriasAportadas()
    }
}

class Vaca(
    edad: Int,
    peso: Double,
    habitat: Habitat,
    cuidador: Cuidador
) : Animal("Vaca", edad, peso, habitat, cuidador), Comestible {

    override fun hacerSonido() = println("Mugido")
    override fun formaDeComer() = println("A la parrilla, guisada")
    override fun caloriasAportadas() = println("2500 kcal por un kilogramo")

    override fun mostrarInfo() {
        println("ANIMAL: ${nombre.uppercase()}")
        println("  > Edad: $edad anios")
        println("  > Peso: $peso kg")
        println("  > Habitat: ${habitat.tipo}")
        print("  > Sonido: "); hacerSonido()
        println("  > Comestible: Si")
        print("  > Forma de comer: "); formaDeComer()
        print("  > Calorias: "); caloriasAportadas()
    }
}

class Manzana(
    color: String,
    peso: Double,
    nivelDulzura: Int,
    origen: Origen,
    informacionNutricional: InformacionNutricional
) : Fruta("manzana", color, peso, nivelDulzura, origen, informacionNutricional) {

    override fun formaDeComer() = println("A mordidas")
    override fun caloriasAportadas() = println("95 kcal por una pieza mediana")
}

class Naranja(
    color: String,
    peso: Double,
    nivelDulzura: Int,
    origen: Origen,
    informacionNutricional: InformacionNutricional
) : Fruta("naranja", color, peso, nivelDulzura, origen, informacionNutricional) {

    override fun formaDeComer() = println("Partida o en gajos")
    override fun caloriasAportadas() = println("62 kcal por una pieza mediana")
}

class Platano(
    color: String,
    peso: Double,
    nivelDulzura: Int,
    origen: Origen,
    informacionNutricional: InformacionNutricional
) : Fruta("platano", color, peso, nivelDulzura, origen, informacionNutricional) {

    override fun formaDeComer() = println("Pelado o licuado")
    override fun caloriasAportadas() = println("105 kcal por una pieza mediana")
}


fun main() {

    val leon = Leon(7, 215.0, Habitat("Sabana", 30.0, "Kenia"), Cuidador("Marcos", 10, "Felinos"))
    val gallina = Gallina(1, 2.8, Habitat("Granja", 20.0, "Jalisco"), Cuidador("Luis", 5, "Aves"))
    val vaca = Vaca(6, 680.0, Habitat("Campo", 22.0, "Texas"), Cuidador("Carlos", 12, "Ganado"))

    val manzana = Manzana("Roja", 165.0, 8, Origen("Mexico", "Puebla", "Finca Verde"), InformacionNutricional(52.0, 10.0, 2.4, 0.3))
    val naranja = Naranja("Naranja", 185.0, 6, Origen("Espania", "Sevilla", "Huerto del Sol"), InformacionNutricional(47.0, 9.0, 2.4, 0.9))
    val platano = Platano("Amarillo", 135.0, 9, Origen("Ecuador", "Los Rios", "Plantacion Tropical"), InformacionNutricional(89.0, 12.0, 2.6, 1.1))

    println("=== SECCION DE ANIMALES ===")
    println()
    leon.mostrarInfo()
    println()
    gallina.mostrarInfo()
    println()
    vaca.mostrarInfo()
    println()

    println("=== SECCION DE FRUTAS ===")
    println()
    manzana.mostrarDetalles()
    println()
    naranja.mostrarDetalles()
    println()
    platano.mostrarDetalles()
}