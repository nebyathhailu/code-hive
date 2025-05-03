fun main() {
    //#1
    var notes= organizeWallet(arrayOf(200,100,400,100,50))
    println(notes.contentToString())

    //#2
    println(isPalindromic("Hannah"))
    println(isPalindromic("Mariam"))

    var c:Array<String> ?= null
    c= arrayOf("n","b")
    println(c.contentToString())
    var x = evenSplit(arrayOf("jackie","Leah","erenda","iota"))
    println(x)


}

//#1
fun organizeWallet(notes:Array<Int>):Array<Int>{
    return notes.sortedArray()
}

//#2
fun isPalindromic(name:String):Boolean{
    //method1
//    return name.lowercase() == name.lowercase().reversed()

    // method2
    var lname = name.lowercase()
    var l = 0
    var r = lname.length-1
    while(l<r){
        if(lname[l] == lname[r]){
            l++
            r--
        }
        else{
            return false
        }
    }
    return true
}

//#3
fun estimateShippingCost(diameterA:Int, diameterB:Int, numA:Int,numB:Int, rate:Double): Double{
    val pi = 3.1415;
    val radiusA = diameterA/200.0
    val typeAVol = (4/3.0) * pi * radiusA * radiusA * radiusA * numA
    val radiusB = diameterB/200.0
    val typeBVol = (4/3.0) * pi * radiusB * radiusB * radiusB * numA
    val totalVolume = typeAVol + typeBVol
    return totalVolume
}

//#4
   //
fun isPasswordValid(userPassword:String): Boolean{
    var badpass = "password123".lowercase().toCharArray().sorted().joinToString("")
   val sortedPass = userPassword.lowercase().toCharArray().sorted().joinToString("")
    return if(badpass == sortedPass){
        false
    }
    else{
        true
    }
    //    return badpass != sortedPass
}


//5
fun evenSplit(names:Array<String>):Boolean{
    var vowels = arrayOf('a','e','u','o','i')
    var vowelCount  = 0
    for (name in names){
        if (name.lowercase().first() in vowels){
            vowelCount++
        }
    }
    if(vowelCount == names.size/2){
        return true
    }
    else{
        return false
    }
}