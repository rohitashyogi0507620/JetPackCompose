package com.yogify.kotlinwork

fun main() {

    // Here we are  talking about OOPS Concept in Kotlin Programming Language

    // Object
    val car = Car()
    car.color = "Yellow"
    println(car.color)
    car.drive()
    // Paramter in Class

    var motor = Motor("Yellow", "Rang Ronver")
    motor.drive()
    motor.speed(200, 20)

    var turk = Turck();
    turk.speed(500, 200)
    turk.drive()

    val buttton = Button("Your New InterFace Bro")
    buttton.onclick("Rohitash Yogi")

}

// Class
class Car {
    var color: String = "RED"

    fun drive() {
        println("Person is Driving")
    }
}

// open keyword to oprn that class for inheritance for both class and function to override
open class Motor(var color: String, var model: String) {
    init {
        color = "Blue"
        model = "Swift"
    }

    open fun speed(maxspped: Int, minspeed: Int) {
        println("Car Max Speed Is $maxspped and Min Speed is $minspeed")
    }

    open fun drive() {
        println("Person is Driving $model car which has $color color")
    }

}

class Turck() : Motor("Yello", "Mahindara") {
    override fun drive() {
        println("Wooho This is Truck Man")
    }

}

//Interface in Kotlin

interface ClickEvent {
    fun onclick(message: String)
}

class Button(val lable: String) : ClickEvent {
    override fun onclick(message: String) {
        println("Clicked By $message and lable is $lable")
    }

}