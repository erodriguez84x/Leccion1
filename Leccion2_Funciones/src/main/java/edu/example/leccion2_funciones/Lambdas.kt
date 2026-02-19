package edu.example.leccion2_funciones


//--Paso 1: Aprenda sobre las lambdas
var dirtyLevel = 20
val waterFilter1 = { dirty: Int -> dirty / 2 }


val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun main() {
    println(waterFilter(dirtyLevel))

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))


    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}

//--Paso 2: Crea una función de orden superior

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1