package com.podo.basicsam

// 조건형 반복문, 범위형 반복문
fun main() {

    var a = 0

    while(a < 5) {
        println(++a)
        println(a)//++,-- : 증감 연산자 , 전위연산자(이번 구문부터)와 후위연산자(다음 구문부터)
    }
    //do while은 조건과 관계없이 무조건 한 번 실행

    do {
        println(++a)
    } while(a < 5)

    for(i in 0..9 step 3) {
        print(i)
    }
    for(i in 9 downTo 0) {
        print(i)
    }
    for(i in 'a'..'z') {
        print(i)
    }
    for(i in 1..10) {       //흐름제어 break, continue
        if (i == 3) break
        println(i)
    }
    for(i in 1..10) {
        if (i == 3) continue
        println(i)
    }
    loop@for(i in 1..10) {
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop //논리 연산자 &&(and), ||(or), !(not)
            println("i : $i, j : $j")
        }
    }// label을 통해 다중 반복문 한번에 종료
    println(true && false)
    println(true || false)
    println(!true)

    var h = Person("헨리", 1997)
    h.introduceYourself()
}
