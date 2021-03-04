//패키지 안받음


fun main() {

    var r = Rabbit()
    r.eat()
    r.sniff()

    var d = Dog()
    d.eat()
    d.run()

}

abstract class Animal { //추상화 단독으로 instacne 만들 수 없음

    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal() { //클래스는 하나만 상속받을 수 있는듯

    override fun eat(){
        println("당근을 먹습니다.")
    }
}
/*
    인터페이스
    인터페이스는 생성자 가질 수 없음, 추상 함수는 생성자를 가질 수 있음
    body가 있는 함수 -> open으로 간주
    body가 없는 함수 -> abstarct로 간주
*/

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}
class Dog: Runner, Eater { // 인터페이스를 여러개 상속 받을 수 있음

    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}

//Overriding은 슈퍼클래스에서 구현이 끝난 함수의 변경이 필요할 때,
//abstract는 형식만 선언하고 실제 구현은 서브클래스에 일임할 때,
//interface는 서로 다른 기능들을 여러개 상솏해야 할 때
