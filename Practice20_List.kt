package com.podo.basicsam
//list
fun main() {

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a)
    {
        print("$fruit:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)

    val test1 = "Test.Kotlin.String"

    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".") // 자바에서와 달리 정규식이 아닌 일반 문자열을 넣어도 동작
    println(test2) //test2는 배열

    println(test2.joinToString()) // 그냥 합쳐짐
    println(test2.joinToString("-")) //문자를 넣어 합쳐짐

    println(test1.substring(5..10))
}