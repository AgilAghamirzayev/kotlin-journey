package lessons

fun main() {
    val emp1 = Employee("Ali", 10)
    val emp2 = Employee("Vali", 20)
    val emp3 = Employee("Ali", 10)
    val emp4 = emp1


    println(emp1 == emp2)
    println(emp1 == emp3)

    println(emp1.equals(emp2))
    println(emp1.equals(emp3))

    println(emp1 === emp2)
    println(emp1 === emp3)
    println(emp1 === emp4)
    
    println(emp1 !== emp4)
    println(emp1 != emp4)

}