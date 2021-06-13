package Kotlin

var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣을 수 있음
var b = "1" // 1
var c = b.toInt() // 1
var d = b.toFloat() // 1.0

var e = "Jhon" // Jhon
var f = "My name is $e Nice to meet you" //$e에 Jhon이 들어간다

//Null
//- 존재하지 않는다
//- 다쓴휴지 = 0
//- 휴지심도 없음, 존재X = Null

//var abc : Int = null
var abc1 : Int? = null // null 을 가질 수 있다.
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a) //15
    println(b) //1
    println(c) //1
    println(d) //1.0
    println(e) //Jhon
    println(f) //My name is Jhon Nice to meet you

    println(abc1) //null
    println(abc2) //null
    println(g) //18

}


