package com.podo.basicsam

//코틀린은 객체지향 언어를 기반으로 함수형 언어의 장점을 흡수
fun main() {

    var a = Person("박보영", 1990) //these are instance
    var b = Person("유희평", 1997)
    var c = Person("카야",2000)
    
    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")

    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.") // 변수명.속성명 a.name 으로 instance 사용
    b.introduceYourself()

}

class Person(var name: String, val birthYear: Int) {  //클래스는 인스턴스(instance)를 만드는 틀
// 생성자 ^ (constructor) 새로운 instance를 만들기 위해 호출하는 특수한 함수
// 생성자 instance 속성 초기화, 생성시 구문 수행

    init { //no parameter, no return
        println("${birthYear}년생 ${name}님이 생성되었습니다.")
    }

    constructor(name: String) : this(name, 1997) { //보조 생성자 : 편의 제공
        println("보조생성자가 사용되었습니다.")
    }

    fun introduceYourself(/*:String, birthYear: Int 필요없음*/) {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
} //이 코틀린 파일이 패키지 안에 속해 있으므로 com.podo.basicsam 패키지를 불러오면 Peron class를 사용할 수 있다.
