package challange

fun main() {

//    print5to5000()
//    printNegative()

    enhancedFor()

}

private fun enhancedFor() {
    for (i in 1..5) {
        println(i)
        if (i == 2) break
        second@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) break@second
            }
        }
    }
}

private fun printNegative() {
    for (i in -500..0) {
        println(i)
    }
}

private fun print5to5000() {
    for (i in 5..5000 step 5) {
        println(i)
    }
}

