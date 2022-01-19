package com.yogify.kotlinwork

fun main() {

    // Enum Used to Create List of constant and moniter state of progam

    // Call Directly
    // val input = Result.FETCHING
    // getResult(result = input)
    // Call From repository
    Repository.startFetch()
    getResult(result = Repository.getCurrentstate())
    Repository.FinishFetch()
    getResult(result = Repository.getCurrentstate())
    Repository.error()
    getResult(result = Repository.getCurrentstate())

}

object Repository {
    private var loadstate: Result = Result.IDEL
    private var datafetched: String? = null
    fun startFetch() {
        loadstate = Result.LOADING
        datafetched = "Data"
    }

    fun FinishFetch() {
        loadstate = Result.FINISH
        datafetched = null
    }

    fun error() {
        loadstate = Result.ERROR
    }

    fun getCurrentstate(): Result {
        return loadstate
    }
}

fun getResult(result: Result) {
    return when (result) {
        Result.LOADING -> println("Loading")
        Result.FETCHING -> println("Fetching")
        Result.COMPLETE -> println("complete")
        Result.FINISH -> println("Finish")
        Result.IDEL -> println("IDEL")
        Result.ERROR -> println("Error")
    }
}

enum class Result {
    LOADING,
    FETCHING,
    COMPLETE,
    FINISH,
    IDEL,
    ERROR
}