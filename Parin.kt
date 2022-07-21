Kotlin is JVM Language

Kotlin need Java Virtual machine (JVM) to exicute it's byte code

Kotlin Supports to avoid nullpointException 

Support Immutablity  [ to be changable ]

Kotlin is Object Oriented programming language

Kotlin is function base programming : Heigher Order Functioning

Benefit of Kotlin Language

1. Less Ceremony 
2. Less code more results
3. Clear Coading


Concise Safe interopre

tool friendly

Evolution of Kotlin  Jylt 2011

Kotlin unveiled by Jetbrains  Feb 2016
1st version of Kotlin V1.0 released

Kotlin  May-2017 Google I/o
Kotlin as adopted for android

1st program 


fun main(args:Array<String>)
{
	print("Hello World")
	
}




2nd Programm 

fun main(args:Array<String>) :Unit

	// Note : Unit does not return any value(Work as a Void)
	// Note : Semicolon is Optional
	
{
	
	println("Hello")
	println("This is Patin")
	
}

result :

Hello
This is Parin




Data Type

Which type of value store in a variable value

1. Numatic  

	0 to 9   	:  	Int type of Value
	0.1 to  9.0 : 	Float type of Value

2. Characters

A to Z  and   a to z   type of value



Variable Declaration rules 

> 	Every variable name should start with alphabate or 
	Underscore ( _ )
> 	No space are allowed in variable declaration
> 	Except Underscore ( _ ) no other special charactor are allowed
	in middle ot the varriable declaration
Note : not allowed  roll -no allowed


3rd Programm

fun main(args:Array<String>)
{
    var name="Kotlin"

    print(name)
}


4th Programm

fun main(args:Array<String>)
{
    var name:String="Android"
    var marks:Int= 150

    println(name)
    println(marks)
}


5th Programm

fun main(args:Array<String>)
{
    println(7/3)
    println(7/3.0)

    var num=3
    println(7/num.toDouble())
}

//  
var  =   we can change it   [ it's mutable ]

val = we can not change it  [ it's immutable ]

fun main(args:Array<String>)

6th Programm

{
	var num1=45
	val num2=55
	println ( num1)
	println ( num2)
	
	num1= 50
	num2= 60 //   this value can not change because  we asign 
			 //		this value as  val 
	
	println ( num1)
	println ( num2)

}
	
	
7th Programm

fun main(args:Array<String>)

{
	var statues:Boolean
	
	statues = true
println(Statues)

}

                            Array

8th Programm

fun main(args:Array<String>)

{
    var subject_Marks= arrayListOf(20,23,24)

    println(subject_Marks[2])

}

                            Multiline String
9th Programm

fun main(args:Array<String>)
{
    var name="Sam"
    var str="Hello " + name
    println(str)
}

10th

fun main(args:Array<String>)
{
    var name="Sam"
    var str="Hello $name"
    println(str)
}

11th

fun main(args:Array<String>)
{
    var name="Sam"
    var str="Hello $name "
    println("The Statement is $str)
}

12th

fun main(args:Array<String>)
{
    var name="Sam"
    var str="Hello $name "
    println("The Statement is $str . the number of charactoris$str is  ${str.length}")
}

13th
fun main(args:Array<String>)
{
    var a=45
    var b=50
    println("The sum of a and b is : ${a+b}")
}

14th 

fun main(args:Array<String>)

{
	var menu:String
	"""
			Hello
	This is Multi Line String
	
	"""
	
	println(menu)
}


15th

fun main(args:Array<String>)
{
    val c='x'
    val massage="Hello"
    val m = massage[0]

// string interpolation

    println("massage is  ${c + m}")
}



		TYPE CONVERSATION
Convert one data type value into another data type 

Implicit conversion:smaller data type value convert in to larger data type

[ it's supported in to java but not supported in kotlin ]



16th 

fun main(args:Array<String>)
{
    var num1 = 502233
    var num2:Long
    num2 = num1.toLong()

    println(num2)

}

		TYPE OF NUMBER CONVERSION
		
	toByte()
	toShort()
	toInt()
	toLong()
	toFloat()
	toDouble()
	toChar()
	

		OPERATOR
	
	1. Arathmatic Operator
		+ , - , * , /  , %
	2. Relational Operator
		<  >  <= >=  == , !=
	3. Logical Operatir
		&& , ||
	4. Unary Operator
		++ , --
	5. Assignment Operator
		=
	
				METHOD
	1. redline
	2. scanner
	
	
17th               readline

fun main(args:Array<String>)
{
    var subject:String
    println("Enter Name of Subject ")
    subject= readLine()!!
    println("subject =$subject")
}


18th

fun main(args:Array<String>)
{
    var num1:Int
    var num2:Int

    println("Enter Number 1 : ")
    num1=Integer.parseInt(readLine())
    println("Enter Number 2 : ")
    num2=Integer.parseInt(readLine())

    println("Number 1= $num1")
    println("Number 2= $num2")
}

19th               Scanner

import java.util.Scanner

fun main(args:Array<String>)
{
    var name1:String
    var marks:Int

    var sc= Scanner(System.`in`)

    println("Enter name of Sub : ")
    name1= sc.next()

    println("Enter Marks = ")
    marks= sc.nextInt()


    println("subject= $name1 and marks = $marks")
} 

			CONTROL STATEMENT

1. Conditional Statement
2. Looping Statement
3. Jumping Statement

	1. Conditional Statement
		1. if
		2. if...else
		3. else...if
		4. nested if
		5. when()
	
	if  statement
	
	syntax : 
	
	if ( condition)
	{
		true statement
	}
	
20th               if

fun main(args:Array<String>) {
    var statues: Boolean = true

    if (statues) {
        println("this is true")
    }

}


21st

import java.util.*

fun main(args:Array<String>)
{
    var num:Int
    var sc= Scanner(System.`in`)

    println("Enter a Number : ")
    num = sc.nextInt()

    if(num>=50)
    {
        println("Number is greater then 50 ")
    }
 
}

21th               if.... else 
	
Syntax :
 
 if(Condition)
 {
 Statement
 }
 else {
 Statement
 }
 
 
 22th 
 
 fun main(args:Array<String>)
 {
	 var num:Int
	 var sc = Scanner(Syatem.'in')
	 
	 println("Enter a Number :  ")
	 num = sc.nextInt()
	 
	 if(num>=0)
	 {
		 println("Number is Posetive")
	 }
	 else{
		 println("Number is Negative")
	 }
 }
 
                   nested if
 
 Syntax :
 
 if(condition)
 {
	 if(condition)
	 {
	 Statement
	 }
 }
 else 
 {
 statement
 }
 
 
 23th               
 
import java.util.Scanner
fun main(args:Array<String>) {
    var marks: Int
    var sc = Scanner(System.`in`)

    println("Enter a Marks :  ")
    marks = sc.nextInt()

    if (marks >= 0 ) {
        if (marks >= 70 && marks <= 100) {
            println(" First Class Pass ")
        } else if (marks >= 60 && marks <= 70) {
            println(" Second Class Pass ")
        } else if (marks >= 30 && marks <= 60) {
            println(" Pass Class ")
        } else {
            println(" Fail ")
        }
    }
}



 24th    Compaitre  three numbers 

import java.util.Scanner

fun main(args:Array<String>)
{

    var num1:Int
    var num2:Int
    var num3:Int
    var sc = Scanner(System.`in`)

            println (" Enter  number 1 : ")
            num1 = sc.nextInt()
            println (" Enter  number 2 : ")
            num2 = sc.nextInt()
            println (" Enter  number 3 : ")
            num3 = sc.nextInt()

    if (num1>num2) 
        {
            if (num1 > num3) 
                {
                println("Number 1 is Greater ")
                } else 
                {
                println("Number 3 is Greater")
                }
        }
        else if (num2 > num3) 
        {
                println(" Number 2 is Greater ")
        }
        else
        {
        println("Number 3 is greater")
        }
}

					when
syntax : 
	when(expression)
	{
		1-> statement
		2-> Statement
	else -> statement
	}
	

25th

import java.util.Scanner

fun main(args:Array<String>) {
    var sc = Scanner(System.`in`)
    var num1: Int

    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    when (num1) {
        1 -> println("Number 1")
        2 -> println("Number 2")
        3 -> println("Number 3")
        4 -> {
            println("Number 4")
            println("Number 5")
        }
        else -> println("Invalide")
    }
}

26th


import java.util.Scanner

fun main(args:Array<String>) {
    var sc = Scanner(System.`in`)
    var choice: Int

    var data ="""
	press 1 for play music
	press 2 for play video
	press 3 for download 
	press 4 for exit
	"""
    println(data)

    println("Enter your choice : ")
    choice = sc.nextInt()

    when (choice) {
        1 -> println(" Music")
        2 -> println("Video")
        3 -> println("Downloading")
        else -> println("Thanks for Visit bye ")
    }

}

when ststement within the range 

27th

import java.util.Scanner

fun main(args:Array<String>)
{
    var marks:Int
    var sc = Scanner (System.`in`)
    println("Pease enter Marks You Get ")
    marks = sc.nextInt()

    when(marks)
    {
        in 1..100->
            println(" Valid  Pass")
        else -> println("Fail / Invalide")
    }
}


Collections

Annay in kotlin have a constant length , So one normally
uses lists, which are similar to the one in python
whats called a  diet in python is called a map in kotlin

[ not to be confused with the functino map() ]

list , map  and  set are all  interfales which are implimented
by many different classes


fun main(args:Array<String>)

val string=Listof ( "Ame","Parin", "Priti" )

val map = mapOf ( "a" to "1", "b" to '2')

val set = setOf("a","b","c")

set<String>



Looping Statement :

for loop
Secquence Control Loop

Syntax : 
for( var in sequence statement)
	

28th

fun main(args:Array<String>)
{
var data= listOf<Int>(1,2,3,4,5)

for( i in data)
{
	println(i)
}
}


29TH

fun main(args:Array<String>) 
{
    for (i in 1..5) 
	{
        println(i)
    }
}

30th 

fun main(args:Array<String>)
{
    for (i in 5 downTo 1) {
        println(i)
    }
}

31th  

fun main(args:Array<String>)
{
    for (i in 1..10 step 4) {
        println(i)
    }
}


32nd      for loop
  
import java.util.*

fun main(args:Array<String>)
{
    var sc = Scanner(System.`in`)
    var marks:Int
    var score=0

    for( i in 1..5)
    {
        print("Enter Marks : ")
        marks = sc.nextInt()
        score = score+marks
    }
    println("Total Marks = $score ")
}


33rd
import java.util.Scanner
import javax.security.auth.callback.ChoiceCallback

fun main(args:Array<String>) {
    var choice:Int=0
    var sc = Scanner(System.`in`)
    var data = """ 
        Please Select 1 for Method 1
        or
        Please Select 2 for Method 2
     
    """
    println(data)
choice = sc.nextInt()
    when (choice){
        1 -> method1()
        2 -> method2()
    }
}
fun method1() {
    var sc = Scanner(System.`in`)
    var num: Int = 0
    var sum: Int = 0
    var sumo: Int = 0

    for (i in 1..5) {
        println(i)
        num = i
        //num = sc.nextInt()
        if (num % 2 == 0) {
            sum += num
        } else {
            sumo += num
        }
    }

    println("Sum of Even Number is : $sum ")
    println("Sum of Odd Number is : $sumo ")
}
fun method2()
{
    var sc = Scanner(System.`in`)
    var num: Int = 0
    var sum: Int = 0
    var sumo: Int = 0

    for (i in 1..5) {
        num = sc.nextInt()
        if (num % 2 == 0) {
            sum += num
        } else {
            sumo += num
        }
    }

    println("Sum of Even Number is : $sum ")
    println("Sum of Odd Number is : $sumo ")
}


while loop

It is Entry Control loop  in while loop condition will cheak
at first  if condition goes true loop will execute


syntax : 

	initlization 
	while ( Condition )
	{
		statement( uppend )
	}
	