package lessons

fun main() {
    val change = 3.22
    println("Amount changed $$change")

    val a = 5
    val b = 10

    println("$a + $b = ${a + b}")


    val filePath = """c:\somefile\some"""
    println(filePath)

    val sentence = """
        This is a sentence.
            This is another sentence.
        This is yet another sentence.
    """.trimIndent()

    println(sentence)
}