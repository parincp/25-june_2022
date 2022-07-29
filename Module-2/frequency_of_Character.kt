import java.util.Scanner

fun main(args:Array<String>) {
    var sc = Scanner(System.`in`)
    println("Please Enter Sentence")
    val inputString = sc.nextLine()

    println("Enter Char")
    val countChar = sc.next()[0]
    var count: Int = 0
    for ( i in inputString.indices) {
        if (countChar == inputString[i]) {
            count++
        }

    }
    println ( "The Frequency of  the Char = $count")
}