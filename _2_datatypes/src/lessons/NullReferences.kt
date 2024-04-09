package lessons

fun main() {
    val str: String? = "This is not null"

    str?.let { printText(it) }

    println(str?.uppercase())

    val str1: String? = null
    println(str1?.uppercase())

    val str3 = str1 ?: "This is not null"
    println(str3.uppercase())

    val str4 = str!!.uppercase()
    println(str4)

}


fun printText(text: String) {
    println(text)
}