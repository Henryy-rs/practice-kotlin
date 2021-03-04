package com.podo.basicsam

//스코프 홤수 : apply, run, with, also, let
fun main() {

    var price = 5000

    var a = Book("포도의 코틀린", 10000).apply {//처리가 끝나면 instace를 반환
        //apply : main함수와 별도의 스코프(scope)에서 instancce를 조작하므로 코드가 깔끔해짐
        name = "[초특가]" + name
        discount() //참조연산자 . 없이 사용 가능
    }

    a.run {
        //run 이미 만들어진 intance를 스코프 안에서 사용하고 싶을때 사용
        println("상품명:${name}, 가격:${price}원")
        //처리가 끝나면 최종 값을 반환
    }

    with(a){ //instance를 parameter로 받는다는 점 빼고 run과 동일
        println("상품명:${name}, 가격:${price}원")
    }
    a.let {//run과 동일하나 it을 사용하여 중복되는 경우 혼란을 방지
        println("상품명:${it.name}, 가격:${it.price}원") //it 은 parameter?
    }
    //run   / let
    //apply / also





}
class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}