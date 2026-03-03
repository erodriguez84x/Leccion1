package example.myapp

interface FishAction01 {
    fun eat()
}

interface FishColor01 {
    val color: String
}

object GoldColor01 : FishColor01 {
    override val color = "gold"
}

class PrintingFishAction01(private val food: String) : FishAction01 {
    override fun eat() {
        println(food)
    }
}

class Plecostomus01(
    fishColor: FishColor01 = GoldColor01
) : FishAction01 by PrintingFishAction01("eat algae"),
    FishColor01 by fishColor

class Shark01(
    fishColor: FishColor01
) : FishAction01 by PrintingFishAction01("hunt and eat fish"),
    FishColor01 by fishColor