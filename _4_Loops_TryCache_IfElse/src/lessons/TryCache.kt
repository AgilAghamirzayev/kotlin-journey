package lessons

fun main() {

    println(getNumberV1("22"))
    println(getNumberV1("22.2"))


    println(getNumberV2("22.2") ?: 0)
    println(getNumberV2("22.8") ?: throw IllegalArgumentException("Invalid number"))

    test("test")
}

fun test(string: String): Nothing{
    throw IllegalArgumentException("Implement me!")
}

fun getNumberV1(number: String): Int {
    return try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        2
    } finally {
        println("finally")
    }
}

fun getNumberV2(number: String): Int? {
    return try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        null
    }
}