data class Emp(val name: String, val salary: Double, val role: String)

class ManagementSystem {
    private val employees = mutableListOf<Emp>()

    fun addEmployee(employee: Emp) {
        employees.add(employee)
    }

    fun deleteEmployee(name: String): Boolean {
        val employee = employees.find { it.name == name }
        return if (employee != null) {
            employees.remove(employee)
            true
        } else {
            false
        }
    }

    fun listEmployees() {
        employees.forEach { println("${it.name}, ${it.salary}, ${it.role}") }
    }
}

fun main() {
    val system = ManagementSystem()
    println("Enter employee details (name, salary, role):")
    val (name, salary, role) = readLine()!!.split(",").map { it.trim() }
    val emp = Emp(name, salary.toDouble(), role)
    system.addEmployee(emp)
    println("Employee added successfully.")

    println("Enter the name of the employee to delete:")
    val empNameToDelete = readLine()!!.trim()
    val deleted = system.deleteEmployee(empNameToDelete)
    if (deleted) {
        println("Employee '$empNameToDelete' deleted successfully.")
    } else {
        println("Employee '$empNameToDelete' not found.")
    }
    println("Remaining Employees:")
    system.listEmployees()
}