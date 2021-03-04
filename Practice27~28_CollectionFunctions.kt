package com.podo.basicsam
//컬랙션 함수
//forEach, fillter, map, any, all, none, first, lastorNull, find, count
//associateBy: 객체에서 키를 뽑아내 map으로 만듦
//groupBy: kry가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
//partition: 아이템에 조건을 따라(type?) 두 컬렉션으로 나누어줌
//flatMap : 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
//getOrElse: 해당 인덱스에 객체가 있으면 받아오고, 없으면 넘겨준다.
//zip : 두개의 컬랙션을 1대1로 합쳐 pair로 된 리스트를 만듦 (아이템의 갯수는 더 작은 컬렉션을 따라감)
fun main() {

    val nameList = listOf("박수영", "김다현", "김지수", "신유나", "김지우")

    nameList.forEach{ print(it + " " )}
    println()

    println(nameList.filter{it.startsWith("김")})

    println(nameList.map {"이름 : "+ it })

    println(nameList.any{it =="김지연" })
    println(nameList.all{it.length == 3 })
    println(nameList.none{it.startsWith("아")})

    println(nameList.first{it.startsWith("김")})
    println(nameList.last{it.startsWith("김")})
    println(nameList.count{it.contains("지")})

    data class Person(val name: String, val brithYear: Int)

    val personlist = listOf(Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나", 2003))

    println(personlist.associateBy { it.brithYear })
    println(personlist.groupBy { it.name })

    val (over98, under98) = personlist.partition { it.brithYear > 1998 }
    println(over98)
    println(under98)

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it*10, it +10) })
    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(10){50})

    val names = listOf("a", "b", "c", "d")

    println(names zip numbers)


}