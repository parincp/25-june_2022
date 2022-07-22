import com.sun.jdi.CharType
import java.util.Scanner

fun main(args:Array<String>)
{
    var num1:Float = 0.0f
    var num2:Float = 0.0f
    var sum:Float = 0.0f
    var sc = Scanner(System.`in`)
    print("Please Enter Number 1 : ")
    num1 = sc.nextFloat()
    print("Please Enter Number 2 : ")
    num2 = sc.nextFloat()

    sum = num1*num2

    println(" Multiplication of Floating Value is : $sum")


    var c:Int
    c = sum.toInt()
   // println(" Multiplication of Floating Value is : $sum")
  //  c = sc.nextInt()
    val ascii = c.toChar()

println("As your Multiplication Two Floating value  Ascii Character is :   $ascii")


}