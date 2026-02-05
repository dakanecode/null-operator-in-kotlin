// data types
// primitive data types
// Byte, Int, Short, Long ... store whole numbers
// Double, Float .... store floating point numbers(decimals)
// Char , Boolean

// string has classes, not primitive

fun main() {

    //    1. Long  ... biggest range
    val longMaxValue = Long.MAX_VALUE   // 9223372036854775807
    val longMinValue = Long.MIN_VALUE   // -9223372036854775808
    println("$longMaxValue,$longMinValue")

//   2.  Int  ..... 32 bits
    val IntegerMaxValue = Int.MAX_VALUE   //2147483647
    val IntegerMinValue = Int.MIN_VALUE  //  -2147483648
    println("$IntegerMaxValue,$IntegerMinValue")
//    try to store a num that is bigger than max num or a num that is less than min num ----- exercise

//        3. Short .... 16 bits
    val shortMaxValue: Short = Short.MAX_VALUE   // 32767
    val shortMinValue: Short = Short.MIN_VALUE   // -32768
    println("$shortMaxValue,$shortMinValue")

//    3. Byte .... 8 bits
    val byteMaxValue: Byte = Byte.MAX_VALUE   // 127
    val byteMinValue: Byte = Byte.MIN_VALUE  // -128
    println("$byteMaxValue,$byteMinValue")


//    Floating point Numbers....default type inferred by the compiler is double

    val doubleMaxValue = Double.MAX_VALUE  //
    val doubleMinValue = Double.MIN_VALUE
    println("The max num a double can store is: $doubleMaxValue ") // 1.7976931348623157E308
    println("The min num a double can store is: $doubleMinValue ") //  4.9E-324

    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE

    println("The max num a float can store is: $floatMaxValue ")  //  3.4028235E38
    println("The min num a float can store is: $floatMinValue ") //  1.4E-45

//    char data type
//    when to use: search a key/letter from a string
    val yourCharValue: Char = 'h'
    val myCharValue: Char = 'D'
    println(myCharValue)
    println(yourCharValue)

//    Boolean can only store true or false .... change true to false and check out the output
//    where to use: you will use them wit control flow statements
    val myBooleanValue = true
    println(myBooleanValue)


//    String
    val myName = "Abdulmajid"
    println(myName)
}
