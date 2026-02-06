fun main() {
//    welcomeMesaage()
//    welcomeMesaage("Alice")
//    displayInfo(age = 30, name = "Bob")
//    println(tripple(7))
//    bookInfo("Kotlin Guide")
//    bookInfo("Advanced Kotlin", 250)
//    println(multiply(3))
//    println(multiply(3,5))
    println(add(y = 2, x = 3))
}
//Exercise 1: Default Parameter
//Create a function welcomeMessage that:
//Takes user: String
//Default value: "Guest"
//Prints "Welcome, <user>!"
//Call it twice:
//Without any argument
//Passing "Alice"
fun welcomeMesaage(user: String = "Guest"){
    println("Welcome $user")
}

//Exercise 2: Named Arguments
//Create a function displayInfo that:
//Takes name: String and age: Int
//Prints "<name> is <age> years old"
//Call it using named arguments in reverse order:
//age = 30, name = "Bob"

fun displayInfo(name: String, age: Int){
    println("$name is $age years old")
}

//Exercise 3: Single-Expression Function
//Create a function triple that:
//Takes an Int
//Returns its triple
//Use single-expression syntax
//Call it with 7 and print the result.
fun tripple(a: Int) = a * 3


//Exercise 4: Default + Named Arguments
//Create a function bookInfo that:
//Parameters: title: String, pages: Int = 100
//Prints: "<title> has <pages> pages"
//Call it twice:
//Using default pages, passing only title = "Kotlin Guide"
//Using named arguments, overriding pages = 250, title = "Advanced Kotlin"
fun bookInfo(title: String, pages: Int = 100){
    println("$title has $pages pages")
}

//Exercise 5: Default + Single-Expression Function
//Create a function multiply that:
//Parameters: a: Int, b: Int = 2
//Returns a * b
//Use single-expression syntax
//Call it twice:
//With one argument (uses default)
//With two arguments (3 and 5)
fun multiply(a : Int, b: Int = 2) = a * b

//Exercise 6: Named Arguments + Single-Expression Function
//Create a function calculate that:
//Parameters: x: Int, y: Int
//Returns sum of x + y
//Use single-expression syntax
fun add(x: Int, y: Int) = x + y