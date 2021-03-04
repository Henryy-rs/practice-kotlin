package com.podo.basicsam

fun main() {

    println("hello")



    var a = 12345 // 타입 추론

    var b: Long = a.toLong() //명시적 형변환(코틀린은 암시적 형변환 안됨)

    println("$a, $b")

    var nullArr = arrayOfNulls<Int>(5) //배열(array)
    var intArr = arrayOf(1, 2, 3, 4, 5)

    /*
                list와 array의 차이
빈 엘리먼트       X       O
값 조회                  Good
값 추가,삭제      Good
array는 형태를 만들고 자료는 넣음 list는 자료가 곧 형태를 만듦
     */

    nullArr[2] = 8
    println(intArr[4])
    println(nullArr[2])

    add(3,4,5)

    var c = 1
    if(c > 0){ // 비교연산자 <,<=, >,>=,!=
        println("c는 0 초과")
    }else{
        println("c는 0 이하")
    }

    doWhen(1)
    doWhen("PoDo")
    doWhen(12L) //long 타입 뒤에 L은 정확히 무엇을 의미하는가> 12L이 정확히 의미하는 것은?
    doWhen(1.67865)
    doWhen("kotlin")

}

fun add(a:Int, b:Int, c:Int) = a+b+c

fun doWhen (a: Any) { //when조건문
    when(a) {
        //1 -> println("a는 1입니다")
        "PoDo" -> println("포도의 코틀린 연습이야")
        is Long -> println("Long type이야")
        !is String -> println("string은 아니야")
        "Po" -> print("포")
        else -> println("나는 잘 모르겠어")
    }
}