package example.myapp

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark color: ${shark.color}")
    shark.eat()

    println("Plecostomus color: ${pleco.color}")
    pleco.eat()
}

fun makeFish01() {
    val pleco = Plecostomus01()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()

    val shark = Shark01(fishColor = object : FishColor01 {
        override val color = "grey"
    })
    println("Shark color: ${shark.color}")
    shark.eat()
}

fun buildAquarium() {
    val aquariumo = Aquarium(numberOfFish = 29)
    aquariumo.printSize()

    println("\n--- Changing volume ---")
    aquariumo.volume = 70
    aquariumo.printSize()

    println("\n--- Custom Aquarium ---")
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()

    println("\n--- Tower Tank ---")
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    println("--- Build Aquarium ---")
    buildAquarium()

    println("\n--- Make Fish ---")
    makeFish()

    println("\n--- Make Fish 01 ---")
    makeFish01()
}