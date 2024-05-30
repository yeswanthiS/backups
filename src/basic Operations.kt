fun main() {
    //Addition
    val sum = 1+ 6
    println(sum)

    val difference = 6 - 1
    println(difference)

    val product = 6 * 7
    println(product)

    val quotient = 25 / 5
    println(quotient)

    val name: String = "Yesh"
    println("Hello, $name!")

    var age: Int = 20
    age = 24
    println("Age: $age")

    // String Interpolation
    val firstName = "yeswanthi"
    val lastName = "Sankurathri"
    val fullName = "$firstName $lastName"
    println("Full Name: $fullName")

    // Conditional Statements
    val number = 10
    if (number > 0) {
        println("Number is positive")
    } else if (number < 0) {
        println("Number is negative")
    } else {
        println("Number is zero")
    }


    // Loops
    // For loop
    for (i in 1..5) {
        println("for loop is:$i")
    }


    // While loop
    var count = 0
    while (count < 3) {
        println("Count while loop: $count")
        count++
    }

    // Functions
    // Function to add two numbers
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    println(add(3, 4))
}