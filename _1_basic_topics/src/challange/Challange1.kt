package challange

fun main() {
    val hello1 = "hello world"
    val hello2 = "hello world"
    println(hello1)
    println(hello2)

    println(hello1 === hello2)
    println(hello1 == hello2)

    val v = 111
    println(v)

    val a: Any
    a = "The any type is the root of the kotlin class hierarchy"
    println(a.uppercase())

    println(
        """
           1
          11
         111
        1111
        """.trimIndent()
    )
}