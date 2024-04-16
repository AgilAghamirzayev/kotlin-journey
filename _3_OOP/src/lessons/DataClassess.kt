package lessons

fun main() {

    val car = Car("Red","Toyota",2022)
    println(car)

    val copy = car.copy()
    println(copy)

    val copyCar = car.copy(year = 2024)
    println(copyCar)

}

data class Car(val color: String, val model: String, val year: Int) {


}


