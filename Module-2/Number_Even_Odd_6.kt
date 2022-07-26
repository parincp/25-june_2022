import java.util.Scanner

fun main(args:Array<String>)
{
    var num:Int
    var sc = Scanner(System.`in`)
    print("Please Enter Number to Cheak it's Even or odd : ")
    num = sc.nextInt()

    if(num %2==0)
    {
        println("Number is Even ")
    } else {
        println ("Number is Odd ")
    }
}