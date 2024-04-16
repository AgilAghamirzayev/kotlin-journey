package lessons

fun main() {

    val labelMultiply = labelMultiply1(3, 4, "3 * 4 =")
    println(labelMultiply)


    val labelMultiply2 = labelMultiply2(3, 4, "3 * 4 =")
    println(labelMultiply2)

    println(labelMultiply2(label = "Result: ", input1 = 22, input2 = 2))

    test(1,2,3,4,5,5)
    test(*intArrayOf(1,2,3,4,5), *intArrayOf(1,2,3))

    val str = "testing i may"
    println(Utils().upperFirstAndLast(str))
    println(str.upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).uppercase() + substring(1)

    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1).uppercase()
}

fun labelMultiply1(input1: Int, input2: Int, label: String): String {
    return ("$label ${input1 * input2}")
}

fun labelMultiply2(input1: Int, input2: Int, label: String) = "$label ${input1 * input2}"

fun test(vararg nums: Int) {
    nums.forEach { println(it) }
}