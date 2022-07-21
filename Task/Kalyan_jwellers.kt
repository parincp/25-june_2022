import java.util.*

fun main(args:Array<String>) {
    var sc = Scanner(System.`in`)
    var name: String
    var lastname: String
    var age: Int
    var gend: String
    var qty: Int
    var rate: Int = 4783
    var makingcharges: Int = 8
    var discount: Int
    var gtotal: Int

    var data = """
                               KALYAN JEWLLERS
 Today Date 05/07/2022                       Rate : 22K Gold [ 4783 1GRM ]
 
      Season Sale  Give you Special Discount  On Purchase of 22K Gold 
    -----------------------------------------------------------------------
          Upto 30% to 40%  Discount for Senior citizen Male* Female*
          Upto 25% to 35%  Discount for Senior citizen Male* Female*
    -----------------------------------------------------------------------
                                       Menu
                         1. Muhurat – Wedding jewellery.
                         2. Mudhra – Handcrafted antique jewellery.
                         3. Nimah – Timeless heritage jeweller.
                         4. Anokhi – Uncut diamond jewellery.
                         5. Rang – Precious stones jewellery.
                         6. Tejasvi – Polki diamonds jewellery.
                         7. Ziah – Diamond jewellery collection.
                         8. Laya – Contemporary gold & diamond jewellery
    
                      """
    println(data)

    print("Please Enter Name : ")
    name = sc.next()
    print("Please Enter Last Name : ")
    lastname = sc.next()
    print("Please Enter Age : ")
    age = sc.nextInt()
    print("Please Enter Gender : ")
    gend = sc.next()
    print("Please enter Qty : ")
    qty = sc.nextInt()
    println("-----------------------------------------------")
    val total = qty * rate
    println("Rate $rate per GRM x $qty GRM ")//= $total")
    println("")
    println("Basic Total Amt is :       $total")
    if (age >= 65) {
        if (total > 100000 && total < 200000) {
                discount = (total * 0.10).toInt()
                    println("Less 10 % Discount is      -$discount")
                        print("Total Payable              ")
                            print(total - discount)
                                println("")
        } else if (total >= 200000 && total < 300000) {
                discount = (total * 0.20).toInt()
                    println("Less 20 % Discount is      -$discount")
                         print("Total Payable              ")
                             print(total - discount)
                                 println("")
        } else if (total >= 300000 && total < 500000) {
                discount = (total * 0.30).toInt()
                    println("Less 30 % Discount is      -$discount")
                        print("Total Payable              ")
                          print(total - discount)
                             println("")
        }
    } else {
        if (total > 100000 && total < 200000) {
                discount = (total * 0.05).toInt()
                    println("Less 5 % Discount is      -$discount")
                         print("Total Payable              ")
                            print(total - discount)
                                println("")
        } else if (total >= 200000 && total < 300000) {
                discount = (total * 0.15).toInt()
                    println("Less 15 % Discount is      -$discount")
                         print("Total Payable              ")
                            print(total - discount)
                                println("")
        } else if (total >= 300000 && total < 500000) {
                discount = (total * 0.25).toInt()
                    println("Less 25 % Discount is      -$discount")
                        print("Total Payable              ")
                            print(total - discount)
                                println("")
        }
    }
}

