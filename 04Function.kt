package Kotlin

//04. Function
//-함수란
// input->output
// y = x + 2

//-함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수몀:타입 ...,) : 반환형 {
//    함수 내용
//    return 반환값
// }

fun plus(first: Int, second: Int): Int {
    println(first) //5
    println(second) //10
    val result: Int = first + second
    println(result) //15
    return result
}

fun main(array:Array<String>){
    // 함수를 호출하는 방법
    val result = plus(5, 10) //15
    println(result) //15
    // 인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30) //20 30 50
    println(result2) //50
    val result3 = plus(second = 100 , first = 10) //10 100 110
    println(result3) //110
}

