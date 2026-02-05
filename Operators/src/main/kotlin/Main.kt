//operators in kotlin
// the +, - , / , * signs are operators while the numbers are operands
// 4, 2 are operands

fun main() {
//    addition operator
    val x = 4
    val y = 2
    var result = x + y
//    println(result)

//subtraction operator
    result = x - y
    println(result)

//division operator
    result = x / y
    println(result)
//modulo
    result = x % y
    println(result)

    // multiplication operator
    result = x * y
    println(result)

//    operator precedence: use the precedence as it is in maths.
//    *, /  have same precedence, higer precedence than +, -
//    +, - have same precedence

//    result = result + 4 // or result += 4 or result -= 4 or result *= 4 etc
    result += 4
    println(result)
}