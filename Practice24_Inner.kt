package com.podo.basicsam
//중첩클래스 : 형태만 내부에 존재, 실질적으로는 내용을 공유할 수 없음
//내부틀래스(inner) : 외부클래스의 객체 안에서 사용되는 객체

fun main() {

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Ineer() //inner class 는 외부 클래스의 객체가 있어야만 객체 생성 가능
    // Outer.Inner.introduceInner -> 오류뜸

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text ="Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Ineer {
        var text =  "Inner Class"

        fun introduceInner() {
            println(text)
        }
        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}
