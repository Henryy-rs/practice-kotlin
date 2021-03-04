

fun main() {
/*
    val a = General("보영", 212)

    println(a == General("보영 ",212))
    println(a.hashCode())
    println(a)

    var b = Data("희평", 524)

    println(b ==  Data("희평", 524))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("여관"))
    println(b.copy(id = 823))
*/
    val list = listOf(Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618))

    for((a, b) in list){
        println("${a}, ${b}")
    }

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)

}
//데이터 클래스 equals, hashcode toSting, copy, component 힘수가 자동 생성

class General(val name: String, val id: Int)

data class  Data(val name: String, val id : Int)

//enum class : enumerated type (열거형, 상태를 구분하기 위한 객체들이 있다.)

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == State.SLEEP
}
