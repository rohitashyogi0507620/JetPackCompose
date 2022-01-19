package com.yogify.kotlinwork

fun main() {
    // Generices type

    // Create an Object of class then call Method
    var listdata = listOf<String>("Hello", "My name is Rohitash", "And  the most")
    var box = Box(listdata);
    box.finditem()


}
// normal class with String Data Type

class Box(private var list: List<String>) {

    fun finditem() {
        list.forEach { data ->
            println(data)
        }
    }
}