package com.yogify.kotlinwork

fun main() {
    // var lang="Kotlin" //you can change
    // val lang="Kotlin"  // can't be changed
    val lang: String = "Kotlin"  // can't be changed
    println("$lang Aldnd jvfg")
    println("Asnak")

    // Use When Condition As Switch and Range between two variable 1..10

    var value: Int = 10;

    when (value) {
        20 -> println("$value is this ")
        30 -> println("$value is this ")
        in 1..10 -> println("$value is this between 1 to 100 ")
    }

    // For Loop
    for (i in 1..10) {
        println(i)
    }

    // Create function
    printevennumber(20)
    //secound type pass value directly into variable
    printevennumber(value = 20)

    // Default Argument Parameters
    printOddNumber()
    //Return type
    println(squreOfValue(value = 10))

    // Lambda Expression
    println(additionOfNumber(10, 20))
    // Lambda expression without return type
    divisionOfnumber(20, 10)

}

val additionOfNumber: (Int, Int) -> Int = { first, second -> first * second }
val divisionOfnumber: (Int, Int) -> Unit = { first, second -> println(first / second) }


fun squreOfValue(value: Int): Int {
    return value * value

}

fun printevennumber(value: Int) {
    for (i in 1..value) {
        if (i % 2 == 0) println(i) else println("$i This is Not Even number")
    }
}

fun printOddNumber(value: Int = 20) {
    for (i in 1..value) {
        if (i % 2 != 0) println(i) else println("$i This is Not Odd number")

    }
}
