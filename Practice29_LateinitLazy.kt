package com.podo.basicsam
//상수 : 절대 바꿀수 없음
//변수의 경우 객체 생성시 시간이 더 걸려 성능 하락
//lateinit : 변수의 값을 나중에 할당함(할당 전까지 변수를 사용할 수 없음),
// 기본 자료형에서는 사용할 수 없음 ::text.isInitialized
fun main() {

    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당된 값"
    println(a.getLateInitText())

    val number: Int by lazy {
        println("초기화를 합니다.")
        7//람다함수
    }//처음 사용할때 초기화가 됨
    println("코드를 시작합니다.")
    println(number)
    println(number)


}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다.")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}
class LateInitSample {
    lateinit var  text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        }else{
            return "기본값"
        }
    }
}