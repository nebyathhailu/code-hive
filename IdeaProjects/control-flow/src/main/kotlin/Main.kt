fun main() {
    categorizeByAge(34)
    categorizeByAge(15)
    correctArticle("apple")
    correctArticle("phone")
    greetByCountry("Ethiopia")
    greetByCountry("Botswana")
    println(greetByCountry2("Rwanda"))
    println(isBalanced("banana"))
    var friends = arrayOf("Anna", "Baraka", "Kate",)
    for(friend in friends){
        if(friend == "Kate" || friend == "Emma"){
            continue
        }
        println(friend)
    }

    var num = 1000
//    while(num >1){
//        if(num%2 != 0){
//            println(num)
//        }
//        num--
//    }

  do {
       if (num%2 == 0){
            println(num)
      }
        num--
  }
   while(num>=1)

   var x = 0;
    while(x<10){
        if(x%2 == 0){
            println(x)
        }
        x++
    }
    fizzbuzz(1000)
}

fun categorizeByAge(age:Int){
    if(age <= 1){
        println("baby")
    }
    else if (age in 2..3){
        println("toddler")
    }
    else if (age in 4..12){
        println("child")
    }
    else if (age in 14..17){
        println("teenager")
    }
    else if (age in 18..35){
        println("Youth")
    }
    else{
        println("old")
    }
}

/*write a function that takes in a word and prints it out with the correct
article. e.g given apple it prints  out an apple and given phone it prints oou a phone*/

fun correctArticle(word:String){
    val vowel = arrayOf('a', 'e','i', 'o','e')
    if (vowel.contains(word[0])){
        println("an $word")
    }
    else{
        println("a $word")
    }
}

fun greetByCountry(country:String){
    if(country == "Rwanda"){
        println("Mwiriwe")
    }
    else if(country == "Ethiopia"){
        println("Kemey amshikum?")
    }
    else if(country == "Kenya"){
        println("Habari ya jiani?")
    }
    else{
        println("Good evening")
    }
}

fun greetByCountry2(country:String):String =
    when (country){
        "Rwanda" -> "Mwiriwe"
        "Ethiopia" -> "Kemey amshikum?"
        "Kenya", "Tanzania" -> "Habari ya jiani"
        else -> "Good evening?"
    }

/*balanced string is one in which the number of vowels equals the number of consonant
for example "banana" write a function that returns true if the string passed to it balanced
*/

/* fun isBalancedString(word:String):Boolean{
    var wordCount = HashMap<String,Int>()
    val vowel = arrayOf('a', 'e','i', 'o','e')
    val consonant = "consonant"
    val vowels = "vowels"
    for (char in word){
        var count = 0;
        if(vowel.contains(char)){

        }
    }
}*/
fun isBalanced(word:String):Boolean{
    val vowel = arrayOf('a', 'e','i', 'o','e')
    var count = 0
    for (char in word){
        if(char in vowel) {
            count++
        }
    }
    return count == word.length - count
}

/* write a function that prrints out all the numbers between 1 and 100. for multiplies of 3 it
* should print out "fizz" instead of the number. for multiplies of 5 it will print out "buzz"
* instead and for multiple of both it should print out "fizzbuzz"*/

fun fizzbuzz(nums:Int){
    for (num in 1..nums){
        if(num%5 == 0 && num%3 == 0){
            println("fizzbuzz")
        }
        else if(num%5 == 0){
            println("buzz")
        }
        else if(num%3 == 0){
            println("fizz")
        }
        else{
            println(num)
        }
    }
}

