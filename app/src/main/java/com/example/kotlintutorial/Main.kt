package com.example.kotlintutorial

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val jim = "James T Kirk"
    val tim = "Tim Buchalka"
    println(tim)

    var timsWeeklySalary: Int = 16
    var timsMonthlySalary: Int = timsWeeklySalary * 3
    println("Tim's $ weekly salary is $$timsWeeklySalary")
    println("Monthly, that comes to $timsMonthlySalary")

    println()

    val banana: Int = 12
    val oranges: Int = 10
    var fruit: Int = banana - oranges
    println("$banana apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${banana / 4}")

    println()
    val weeks: Int = 200
    val years: Double = weeks / 52.0
    println("$weeks weeks is $years years")

    println("My name is $tim")
    println("jim is $jim")
}