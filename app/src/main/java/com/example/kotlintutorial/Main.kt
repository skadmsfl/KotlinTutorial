package com.example.kotlintutorial

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var tim: String
    tim = "Tim Buchalka"
    println(tim)

    var timsWeeklySalary: Int = 16
    var timsMonthlySalary: Int = timsWeeklySalary * 3
    println(timsWeeklySalary)
    println(timsMonthlySalary)

    println()

    val banana: Int = 12
    val oranges: Int = 10
    var fruit: Int = banana - oranges
    println(fruit)

    println(oranges / 2)

    println()
    val weeks: Int = 200
    val years: Double = weeks / 52.0
    println(years)
}