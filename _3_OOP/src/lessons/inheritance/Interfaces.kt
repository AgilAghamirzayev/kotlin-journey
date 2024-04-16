package lessons.inheritance

fun main() {
    Test1().method1()
    Test1().method2()
    Test1().method3()
}

class Test1: Interface2, Interface3 {

    override val num: Int = 11

    override fun method2() {
        println("method2")
    }

    override fun method3() {
        println("method3")
    }

    override fun method1() {
        println("method1")
    }

}

interface Interface1 {
    val num: Int
    val num2: Int
        get() = num * 100

    fun method1()
}

interface Interface2: Interface1 {
    fun method2()
}

interface Interface3: Interface1 {
    fun method2()
    fun method3()
}
