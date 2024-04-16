package lessons

fun main() {

    val employee1 = Employee1("Ali")
    val employee2 = Employee2("Ali")
    val employee3 = Employee3("Ali")
    val employee4 = Employee4("Ali")
    println(employee1.name)
    println(employee2.name)
    println(employee3.name)
    println(employee4.name)

    val employee6 = Employee6("Ali")
    val employee7 = Employee6("Vali", false)

    println(employee6)
    println(employee7)

    val employee07 = Employee7("Ali")
    val employee007 = Employee7("Vali", false)
    println(employee07)
    println(employee007)

    val employee8 = Employee8("Vali", false)
    println(employee8.fullTime)

    employee8.fullTime = true
    println(employee8.fullTime)

}

class Employee1 constructor(name: String) {
    val name: String

    init {
        this.name = name
    }
}

class Employee2 constructor(name: String) {
    val name: String = name

}

class Employee3 constructor(val name: String) {

}

class Employee4(val name: String) {

}

class Employee5 protected constructor(val name: String) {

}

class Employee6(val name: String) {
    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }

    override fun toString(): String {
        return "name=$name, fullTime=$fullTime"
    }

}

class Employee7(val name: String, var fullTime: Boolean = true) {

    override fun toString(): String {
        return "name=$name, fullTime=$fullTime"
    }

}

class Employee8(val name: String, fullTime: Boolean = true) {
    var fullTime = fullTime
        get() {
            println("Get method")
            return field
        }

        set(value) {
            println("Set method")
            field = value
        }
}