package lessons

typealias EmployeeSet = Set<Employee>

fun main() {
    val employees: EmployeeSet
    val employee1 = Employee("Ali", 500)
    val employee2 = Employee("Vali", 1000)
    employees = hashSetOf(employee1, employee2)
    println(employees)

    val names = arrayListOf("A", "B", "C", "D", "E")
    println(names[1])

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |    (Benjamin Franklin)
    """.trimMargin()

    println(text)
}