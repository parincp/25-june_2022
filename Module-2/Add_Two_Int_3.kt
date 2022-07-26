import java.util.Scanner

fun main(args:Array<String>)
{
    var sc = Scanner(System.`in`)
    var num1:Int
    var num2:Int
    var sum:Int

    println("Enter First Number : ")
    num1 = sc.nextInt()

    println("Enter Second Number : ")
    num2 = sc.nextInt()

    sum = num1+num2

    println("your total is : $sum")

}