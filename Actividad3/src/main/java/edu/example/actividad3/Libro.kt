package edu.example.actividad3
class Libro(titulo: String, anioPublicacion: Int) : ElementoMultimedia(titulo, anioPublicacion), Prestable {
    override fun prestar() {
        println("El libro '$titulo' ha sido prestado exitosamente.")
    }

    companion object {
        const val TIPO_RECURSO = "Libro"
    }
}