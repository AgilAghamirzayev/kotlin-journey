package lessons

fun main() {

    val names = arrayOf("Ali", "Vali", "Aysu")

    val longs1 = arrayOf(1L, 2L, 3L, 4L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val ints1 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(ints1 is Array<Int>)

    println(names[1])

    val evenNumbers = Array(16) { i -> i * 2 }

    for (number in evenNumbers) {
        println(number)
    }

    val intArrayOf = intArrayOf(1, 2, 3, 4, 5, 1 + 1)
    val longArrayOf = longArrayOf(1, 2, 3, 4, 5, 1 + 1)
    val doubleArrayOf = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 1.0 + 1.0)
    val floatArrayOf = floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 1.0f + 1.0f)
    val charArrayOf = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
    val booleanArrayOf = booleanArrayOf(true, false, true, false, true)
    val byteArrayOf = byteArrayOf(1, 2, 3, 4, 5, 1 + 1)
    val shortArrayOf = shortArrayOf(1, 2, 3, 4, 5, 1 + 1)


    var someArray = IntArray(5)
    for (num in someArray) {
        println(num)
    }

}