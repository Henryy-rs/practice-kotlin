//genecric

// 캐스팅은 프로그램의 속도를 저하시킬 수 있음
fun main() {
    UsingGeneric<A>(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun<T:A>doShouting(t: T){
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다.")
    }
}
class B: A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}
class C: A() {
    override fun shout() {
        println("C가 소리칩니다.")
    }
}
class UsingGeneric<T:A>(val t: T) { //캐스팅 방지 성능 높임
    fun doShouting() {
        t.shout()
    }
}
