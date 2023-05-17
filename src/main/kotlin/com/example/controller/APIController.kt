package com.example.controller


class APIController {
    private fun isOdd(x: Int) = x * 3
    private fun isNameExisted(name: String): Boolean = name == "brillig" || name == "slithy" || name == "tove"

    fun accessTestMessage(): String {
        val numbers = listOf(1, 2, 3)
        println(numbers.map(::isOdd))
        return numbers.toString()
    }

    fun accessName(name: String): String {
        val listNames = listOf(name)
        return listNames.map(::isNameExisted).toString()
    }
}