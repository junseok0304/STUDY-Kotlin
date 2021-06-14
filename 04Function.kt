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

//디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int , second: Int = 5): Int{
 val result: Int = first + second
    return result

}

//반환값이 없는 함수 만들기(1)
fun printPlus(first: Int , second: Int):Unit {
    val result: Int = first + second
    println(result)

}
//반환값이 없는 함수 만들기(2)
fun printPlus2(first: Int , second: Int) {
    val result: Int = first + second
    println(result)

}

//-간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second


//가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}



fun main(array:Array<String>) {
    // 함수를 호출하는 방법
    val result = plus(5, 10) //15
    println(result) //15
    // 인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30) //20 30 50
    println(result2) //50
    val result3 = plus(second = 100, first = 10) //10 100 110
    println(result3) //110

    //디폴드 값을 갖는 함수 호출하기
    println()//
    val result4 = plusFive(10, 20)
    println(result4) //30
    val result5 = plusFive(10)
    println(result5) //15

    println()//
    printPlus(10, 20)//30

    println()//
    val result6 = plusShort(50, 50)
    println(result6) //100

    println()//
    plusMany(1,2,3) // 1 2 3
    plusMany(100)// 100

}
