package com.podo.basicsam
//Collevcion 클래스의 list와 set, map
//list : 순서 있음. 중복 허용
//set : 순서 없음, 중복 허용되지 않음 index로 위치 찾을 수 없음
//map : 키와 벨류를 가짐 key를 통해 객체를 참조
fun main() {

    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a)
    {
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    val b = mutableMapOf("레드벨벳" to "덤덤",
        "트와이스" to  "FANCY",
        "ITZY" to "ICY")

    for(entry in b)
    {
        println("${entry.key} : ${entry.value}")    
    }
    
    b.put("오마이걸", "반지")
    println(b)
    
    b.remove("ITZY")
    println(b)
    
    println(b["레드벨벳"])
}