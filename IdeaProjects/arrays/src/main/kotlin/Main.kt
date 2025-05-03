/*fun main() {
    val currency= arrayOf("pound","shilling","dollar","yen", "birr") // array of string
    println(currency.contentToString())
    println(currency::class.simpleName) --Data type
    println(currency[4])
    val year=arrayOf(1998,1996,2000)//datatype-array of integers

    val southAfrica=arrayOf("Cyril Ramaphosa", 6279000, false , "Rand" )
    println(southAfrica.contentToString())
    you can't extend the size of an array in kotlin.
}
fun main()
{
    var currency= arrayOf("pound","shilling","dollar","yen", "birr")
    val cur= currency.get(1)
    println(currency.contentToString())
    currency.set(3, "won")
    println(currency.contentToString())

    currency[1]="dirham"
    println(currency.contentToString())

   currency = currency.plus("yen" )
    println(currency.contentToString())
    currency = currency.plus(arrayOf("rand", "real"))
    println(currency.contentToString())
    println(currency.indexOf("birr"))
    println(currency.indexOf("Real"))
}
*/

fun main() {
  val num = arrayOf(13, 34, 56, 23, 64, 43)
    for (x in num)
    {
        val square= x * x
        println("The square of $x is $square")
    }
    println(num.size)
    println(num.sum())
    println(num.count())
    println(num.average())
    println(num.min())
    println(num.max())}
//  var currencies = arrayOf("pound", "shilling", "dollar", "yen", "birr")
//  for (currency in currencies) {
//    println(currency)
//  }
//  currencies.forEach { currency -> println(currency) }
//   val b =num.forEach { x ->  val square = x * x
//    println("The square of ${x} is ${square}.")
//  }
//}

//    // sorting arrays
//
//    val sortedNum =num.sortedArrayDescending()
//    println(sortedNum.contentToString())
//
//    var sortedCurrency = currencies.sortedArray()
//    println(sortedCurrency.contentToString())
//
//    val x = num.sorted()
//    println(x)
//
//  }
//
//}


