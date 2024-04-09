package lessons

fun main() {
    val myInt = 11
    val myLong = 11L
    val toLong = myInt.toLong()
    val myByte1: Byte = 111
    val myByte2: Byte = 127
    val myShort: Short = 111

    val myByte3: Int = myByte1 + myByte2
    println(myByte1 + myByte2)
    println(myByte3)

    val char  = 'b'
    val myChar = 99
    println(char)
    println(myChar.toChar())
}