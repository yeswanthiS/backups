package Assignments

class User(private val username: String, private val password: String) {
    private var loggedIn = false

    fun login(username: String, password: String): Boolean {
        if (this.username == username && this.password == password) {
            loggedIn = true
            println("Login successful!")
            return true
        }
        println("Login failed. Incorrect username or password.")
        return false
    }

    fun displayExpenseSummary() {
        if (loggedIn) {
            println("Expense Summary for User: $username")
            // Add logic to display expense summary here
        } else {
            println("Please login first to view expense summary.")
        }
    }
}

fun main() {
    // Create a user
    val user = User("user123", "password123")

    // Attempt to login with correct credentials
    user.login("user123", "password123")

    // Display expense summary after login
    user.displayExpenseSummary()

    // Attempt to login with incorrect credentials
    user.login("user123", "wrongpassword")

    // Display expense summary without login
    user.displayExpenseSummary()
}