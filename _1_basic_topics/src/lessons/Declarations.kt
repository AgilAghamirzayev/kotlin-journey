package lessons

fun main() {
    val number = 25
    val short: Short = 22222
    println(number)
    println(short)

    var var_num = 21;
    println(var_num)

    var_num = 22;
    println(var_num)

    var_num = 23;
    println(var_num)

    val employee1 = Employee("Ali", 500)
    println(employee1)

    employee1.name = "Vali"
    println(employee1)

    val employee2: Employee
    val num2 = 100

    if (number < num2) {
        employee2 = Employee("Ali", num2)
    } else {
        employee2 = Employee("Vali", 1000)
    }

    println(employee2)


}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }
        return false;
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}