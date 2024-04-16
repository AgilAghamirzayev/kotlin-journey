package lessons.singleton

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(Some.Companion.someMethod())
    println(Some.someMethod())

    val justAssign = Some.justAssign("Test")
    val upperOrLower = Some.upperOrLower("Test", true)

    println(justAssign.someString)
    println(upperOrLower.someString)

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            return "SomeInterface.mustImplement.START ${num * 100}"
        }

    })

    println(Department.IT.getDepartmentInfo())
    println(Department.SALES.getDepartmentInfo())

}

enum class Department(val fullName: String, val numEmployees: Int) {

    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20),
    MANAGEMENT("Management", 5),
    OTHER("Other", 12);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"

}

object CompanyCommunications {
    val currentYear: Int = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright © $currentYear Our company. All rights reserved."

}

class Some private constructor(val someString: String) {
    companion object {
        private const val privateVar = 6
        fun someMethod() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = Some(str)
        fun upperOrLower(str: String, loverCase: Boolean): Some {
            if (loverCase) return Some(str.uppercase()) else return Some(str.lowercase())

        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(someInterface: SomeInterface) {
    println("wantsSomeInterface.START ${someInterface.mustImplement(22)}")
}