package lessons

fun main() {
    val arrayOfNulls = arrayOfNulls<Int?>(5)
    for (i in arrayOfNulls) {
        println(i?.toString())
    }

    println(arrayOfNulls[2].toString())
}