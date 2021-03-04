package com.podo.basicsam

/* 상속(inheritance)의 사용
1. 기존의 클래스를 이용하여 새로운 클래스(들)로 확장할 때
2. 기존의 클래스들의 공통점을 묶어 코드 관리를 편하게 할 때때

슈퍼클래스(물려줌), 서브클래스(물려받음)
상속시 규칙
1. 서브클래스는 수퍼클래스에 존재하는 속성(함수, 변수)과 같은 이릅의 속성을 가질 수 없다.
2. 서브클래스가 생성될 때는 반드시 수퍼클래스의 생성자까지(포함해서) 호출되어야 한다.*/

fun main() {

    var a = Animal("별이", 5,"개")
    var b = Dog("달이", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("보리", 5, true)

    c.introduce()
    c.meow()

    var t = Tiger("호돌이", 6)
    t.eat()

}

open class Animal(var name: String, var age: Int, var type: String) {//open상태여야 상속 가능

    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.") //클래스 자신의 속성임이 확실하므로 this안써도 됨
    }

    open fun eat() { //open이면 오버라이딩(overridding) 가능
        println("음식을 먹습니다.")
    }
}

class Dog (name: String, age: Int): Animal(name, age, "개") {

    fun bark() {
        println("멍멍")
    }
}

class Cat (name: String, age: Int, var dogcat: Boolean): Animal(name, age, "고양이") {

    fun meow() {
        println("야옹야옹")
    }
}

class Tiger(name: String, age: Int): Animal(name, age, "호랑이") {

    override fun eat() { //override
        println("고기를 먹습니다.")
    }
}


