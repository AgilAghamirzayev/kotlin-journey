package lessons.inheritance

fun main() {

    val printer = LaserPrinter("Cannon", 11)
    printer.printModel()
    println(printer.bestSellingPrice())

}

abstract class Printer(val model: String) {
    open fun printModel() = println("The model of the Printer is: $model")
    abstract fun bestSellingPrice(): Double
}


open class LaserPrinter(model: String, ppm: Int) : Printer(model) {

    final override fun printModel() = println("The model of the laser printer is: $model")
    override fun bestSellingPrice(): Double = 111.99

}

class SpecialLaserPrinter(model: String, ppm: Int) : LaserPrinter(model, ppm) {

}