package challange

fun main() {
    val float1: Float? = -3.4f
    val float2: Float? = (-3.4).toFloat()

    println(float1)
    println(float2)

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    shortArray.forEach { println(it) }

    val intArray = Array(40) { i -> (i + 1) * 5 }
    intArray.forEach { println(it) }

    Test().method1(charArrayOf('a', 'b', 'c'))

    val x: String? = "I AM IN UPPERCASE"
    val z = x?.lowercase() ?: "I give up"
    println(z)

    val a = x?.lowercase()?.replace("am","am not")
    println(a)

    val nonNullValue: Int? = null
    val toDouble = nonNullValue!!.toDouble()
    println(toDouble)
}