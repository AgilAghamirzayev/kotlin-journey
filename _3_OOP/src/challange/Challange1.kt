package challange

fun main() {
    val bicycle = Bicycle(2, 2, 11)
    val mountainBicycle = MountainBicycle(1, 2, 3, 4)
    val roadBicycle = RoadBicycle(1, 2, 3, 4)

    bicycle.printDescription()
    mountainBicycle.printDescription()
    roadBicycle.printDescription()
    println()

    val bicycle2 = Bicycle(2, 2)
    val mountainBicycle2 = MountainBicycle(1, 2, 3)
    val roadBicycle2 = RoadBicycle(1,  gear = 3, tireWidth = 4)

    bicycle2.printDescription()
    mountainBicycle2.printDescription()
    roadBicycle2.printDescription()

    MountainBicycle.availableColors.forEach { println(it) }
}

open class Bicycle(var cadence: Int, var gear: Int, var speed: Int = 10) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Cadence: $cadence, Gear: $gear, Speed: $speed")
    }

}

class MountainBicycle(var seatHeight: Int, cadence: Int, gear: Int, speed: Int = 10) :
    Bicycle(cadence, gear, speed) {

        constructor(seatHeight: Int, cadence: Int, gear: Int, speed: Int, color: String) :
                this(seatHeight, cadence, gear, speed) {
            println(color)
        }

    companion object {
        val  availableColors: List<String> = listOf("blue", "green", "yellow", "red", "black", "white")
    }


    override fun printDescription() {
        super.printDescription()
        println("Seat Height: $seatHeight")
    }
}

class RoadBicycle(cadence: Int, speed: Int = 10, gear: Int, val tireWidth: Int) :
    Bicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("Tire Width: $tireWidth")
    }
}