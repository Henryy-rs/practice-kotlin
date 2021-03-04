package com.podo.basicsam

//?. null safe operator 객체가 null이면 실행안함 ?:
// elvis operator 객체가 null이면 뒤에 오는 값을 사용
// !!. non-null assertion operator 참조연산자를 사용할 때 nuill여부를 컴파일시 확인하지 않도록 하여 null pointer exception 뜨ㅡ게함
fun main() {

    var a: String? = null
    /*
    println(a?.toUpperCase())
    println(a?:"default".toUpperCase())
    println(a!!.toUpperCase())
    */
    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    var c = Product("콜라", 1000)
    var d = Product("콜라", 1000)
    var e = c
    var f = Product("사이다", 1000)

    println(c.equals(d))
    println(c==d)
    println(c===d)
    println(c==e)
    println(c===e)
    println(c==f)
    println(c===f)

    //변수의 동일성: 내용의 동일성(a==b), 객체의 동일성(a===b)
}

class Product(val name: String, val price: Int) { //커스텀 클래스를 만들때는  equals를 따로  구현해주어야함
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}