package com.podo.basicsam
//overloading 같은 이름의 함수도 다양한 자료형(패러미터들)을 받아서 사용할 수 있음
fun main() {

    read(7)
    read("사마사마")

    deliveryItem("짬뽕") // 패러미터가 없다면 지정된 기본값으로 출력됨
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    deliveryItem("선물", destination = "친구집") //named arguments

    println(sum(1,2,3,4))
    println(6 multiply 4)

}
fun read(x: Int) {
    println("숫자 $x 입니다")

}
fun read(x: String) {
    println(x)
}

fun deliveryItem(name: String, count:Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배송하였습니다람쥐")
}
fun sum(vararg numbers: Int) { //vararg : 패러미터 갯수 제한이 없음. 맨 마지막에 위치해야함
    var sum = 0

    for(i in numbers){
        sum += i
    }

    print(sum)
}

infix fun Int.multiply(x: Int): Int = this * x
//연산자처럼 쓸 수 있는 infix ex) 4 multiply 6 4.multiply(6)도 가능