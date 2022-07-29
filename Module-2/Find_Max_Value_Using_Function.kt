import java.util.Scanner

fun main(args:Array<String>)
{
var largValue = max(5,15)
println("A greater Number is : $largValue")

}

fun max( a:Int , b:Int):Int
{

//    var sc = Scanner(System.`in`)
  //  a = sc.nextInt()
    //b = sc.nextInt()

    if(a>b)

        return a
    else
        return b
}