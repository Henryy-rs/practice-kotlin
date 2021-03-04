package com.podo.basicsam
//상위 스코프
internal val a = "패키지 스코프"

class B {//하위(클래스) 스코프
    fun print() {
        println(a)
    }
}

fun main() {
    val a = "함수 스코프" //재정의 가능
    println(a)
    B().print()
}
/*
패키지 스코프에서
public : 어떤 패키지에서도 접근 가능
internal : 같은 모듈 내에서만 접근 가능
private : 같은 파일 내에서만 접근 가능

클래스 스코프에서
public(기본값)
private : 클래스 내부에서만 접근 가능
protected : 클래스 내부, 상속받은 클래스에서 접근 가능
접근제한자 modifier?"

 */