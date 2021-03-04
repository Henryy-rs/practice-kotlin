package com.podo.basicsam
//비트연산 플래그 값 처리, 네트워크에서 프로토콜의 데이터 양 줄이기
//상위 비트 -----하위비트(맨 앞은 부호비트이기 때문에 데이터 담지 말것
fun main() {

    var bitData: Int = 0b10000

    bitData = bitData or(1 shl 2) //세번째 자리에 1이 set 됨
    println(bitData.toString(2))

    var result = bitData and (1 shl 4)
    println(result.toString(2))

    println(result shr 4)

    bitData = bitData and ((1 shl 4).inv()) //반전
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))

}
//하위에서부터 생각해야됨