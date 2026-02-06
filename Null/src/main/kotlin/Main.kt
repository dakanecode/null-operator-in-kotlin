import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length

fun main() {

//    when you initialize a variable, it stores values
//    eg
    var num = 2
    println(num)
//    but if you initialize a variable wit null, it means it
//    stores nothing, this causes many crases
//    kotlin is designed to avoid this
//    in kotlin, variables cannt be null by default eg
//    var myName: String = null
//    println(myName)

//  you must say clearly if a variable can be null
//    var myName: String? = null
//    println(myName)
//    ? think of it as variable might be empty.

// safe call operator(?.)
//Used when you want to use a value only if it’s not null.
//    var name: String? = "Alex"
//    println(name?.length)

//    ?: — Elvis operator (default value)
//    var name: String? = null
//    var length = name?.length ?:0
//    print(length)
    var text: String? = null
    var text2 = text ?: "some text"
    println(text2)
//    exercises
//    1. Fix this code so it works:
//    var username = null
//      println(username.length)
//    var username: String? = null
//    println(username?.length)

//    Exercise 2: Use a default value
//    var name: String? = null
//    var length = name?.length ?: 0
//    println(length)






    }

