package com.podo.basicsam

//고차함수 : 클래스에서 만들어 낸 instance처럼 취급
// 함수를 parameter로 넘겨 줄 수도 있고 결과값으로 반환 받을 수도 있음

fun main() {

    b(::a) //고차함수a를 instance로 넘김
    b(::c)

    val d: (String)->Unit = {str/*: String*타입추론*/ ->
        println("$str 람다함수")} //람다함수

    println(d)

    b(d)

    val e: (Int, Int)->Int = {a: Int, b: Int ->

        println("$a, $b")
        a+b //마지막 구문의 값이 Int로 변환
    }
    println()

    //print에 함수를 넣으면 실행이 되고 나서 그 결과값이 출력 되는듯\

    val items = listOf(1, 2, 3, 4, 6)
    val s = items.fold(0, {
            acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // The last expression in a lambda is considered the return value:
        result
    })
    println(s)

    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)

    println("joinedToString = $joinedToString")
    println("product = $product")


}

fun a (str: String) {
    println("$str 함수 a")
}

fun c (str: String) {
    println("$str 함수 c")
}

fun b (function: (String)->Unit) {
    function("b가 호출한")

}

//fun <H, P> Collection<H>.add(


//}
fun <T, P> Collection<T>.fold(initial: P, combine: (acc: P, nextElement: T) -> P): P {
    var accumulator: P = initial

    //combine(accumulator, fakeEl)
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}


