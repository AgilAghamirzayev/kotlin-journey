package lessons

import java.math.BigDecimal

fun main() {
//    while (true) {
//        println("hello")
//    }

    val num1 = 11
    val num2 = 11
    val s = getWhen(num1)
    println(s)

    getResult(num1, num2)

    getResult(22)
}

private fun getResult(something: Any) {
    when(something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal.TEN))
        is Int -> println(something - 11)
    }
}

private fun getResult(num1: Int, num2: Int) {
    when {
        num1 > num2 -> println("num1 > num2")
        num1 < num2 -> println("num1 < num2")
        else -> println("num1 == num2")
    }
}

fun getWhen(num: Int): String {
   return when(num) {
        1,2 -> "one"
        4,5 -> "two"
        in 7..11 -> "in range"
        else -> "default"
    }
}
