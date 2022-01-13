package com.yogify.kotlinwork

// Collection in Kotlin
fun main() {

    // List , ArrayList , listof() Collection in kotlin
    var listemploye = listOf(
        "rohitash",
        "Priya",
        "Other"
    ) // Unmutable type of Collection can't able to add new item
    println(listemploye)

    for (item in listemploye) {
        println(item)
    }
    // Get each Item from List
    listemploye.forEach {
        println(it)

    }

    // Mutable type of Collection you can add, Remove items
    var listcourse = mutableListOf(
        "JAVA",
        "ANDROId",
        "KOTLIN",
        "PYTHON",
        "C++"
    )
    listcourse.add("Swift")
    listcourse.forEach {
        println(it)
    }

    // Set Type list don't show duplicate items

    var listsbook = setOf("DATA SCIENCE", "DBMS", "C++", "C++")
    listsbook.forEach {
        println(it)
    }

    // Mutable set

    var listphone = mutableSetOf("Redmi 8 pro", "Moto one Power", "Iphone 6", "Oneplus Nord")
    listphone.add("Moto edge")
    listphone.add("Iphone 6")
    listphone.forEach {
        println(it)
    }

    // Map Store Value in Key Value Pair

    var listmap = mapOf("Name" to "Rohitash Yogi", "City" to "Jaipur")

    listmap.forEach { s, s2 ->
        println("$s : $s2")
    }

    // Mutable Map

    var listmutablemap = mutableMapOf("Name" to "Rohitash Yogi", "City" to "Jaipur")

    listmutablemap["State"] = "Rajasthan"
    listmutablemap.forEach { s, s2 ->
        println("$s : $s2")
    }

    // empty collection
    val emptylist = emptyList<String>()
    val emptyset = emptySet<String>()
    val emptymap = emptyMap<String, String>()

    // Collection Filter

    var listdata = listOf<String>("Tanaya", "Priya", "Peehu", "Megha")
    var filterlist = listdata.filter {
        it.startsWith("P")
    }

    filterlist.forEach {
        println(it)
    }

}