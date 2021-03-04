package com.podo.basicsam
//다형성

fun main() {

    var a = Drink()
    a.drink()

    var b:Drink = Cola() //up-casting
    b.drink()

    if(b is Cola){ //is 는 조건문 안에서만 down-casting됨
        b.washDishes()
    }

    var c = b as Cola // down-casting
    c.washDishes()
    b.washDishes() //반환값 뿐만 아니라 변수도 down-casting되어 오류 뜨지 않음

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}을 마십니다.")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}을 마십니다.")
    }

    fun washDishes() {
        println("설거지를 합시다.")
    }
}
