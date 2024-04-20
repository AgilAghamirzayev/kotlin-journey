package lessons

fun main() {
    val range= 1..40
    println(range)

    for (i in 11..16) {
        println(i)
    }

    for (p in 10 .. 100 step 10) {
        println(p)
    }

    for (p in 108 downTo  10 step  10) {
        println(p)
    }

    for(i in 'A'..'E') {
        println(i)
    }

    val stringRange = "ABC".."XYZ"

    println(stringRange)

    println(32 !in 1..30)

   val num = if (true) 59 else if (false) 99 else 98

}