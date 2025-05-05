fun main() {
    println(goodString("aabbcd"))
    println(goodString("aabcbc"))
    println(percentChar("feather",'e'))
    println(reverse(arrayOf('N','e','b','y','a','t')).contentToString())
    println(numApperance(arrayOf(2,3,4,5,2)))
    println(num(arrayOf(2,3,4,5,2)))
    println(numApperance(arrayOf(2,3,4,5)))
    println(num(arrayOf(2,3,4,5)))
    println(targetSum(arrayOf(4,5,2,1),6).contentToString())
    println(targetSum2(arrayOf(4,5,2,1),6).contentToString())
println(frequency("we are in lovelace"))
}

fun goodString(s:String):Boolean{
    val occurrences = HashMap<Char,Int>() //initializing a hashmap
    for (x in s){
        var xcount = occurrences.getOrDefault(x,0)
        occurrences[x] = ++xcount
    }
    val valueSet = occurrences.values.toSet()
    return valueSet.size == 1
}

//fun isGoodString(s:String):Boolean{
//    val occurrences = HashMap<Char,Int>()
//    for (x in s){
//        var xcount = occurrences.getOrDefault(x,0)
//        occurrences[x] = ++xcount
//    }
//    val values = occurrences.values.toList()
//    //...to be continued
//}

fun percentChar(s:String,c:Char):Double{
    var count = 0
    for(y in s){
        if(y == c){
           count++
        }
    }
    val percent = (count.toDouble()/s.length)/100
    return percent
}

fun reverse(a:Array<Char>):Array<Char>{
    var l = 0
    var r = a.size-1
    while(l<r){
        var temp=a[l]
        a[l]=a[r]
        a[r]=temp
        l++
        r--
    }
    return a
}

fun numApperance(numArray:Array<Int>):Boolean{
    val set = numArray.toSet()
    return set.size != numArray.size
}

fun num(numArray:Array<Int>):Boolean{
    var occurrences= HashMap<Int,Int>()
    for(x in numArray){
        var xcount = occurrences.getOrDefault(x,0)
        xcount = ++xcount
    }

    var values= occurrences.values
    return  values.none{value -> value > 1}

}

fun targetSum(nums:Array<Int>,target:Int):Array<Int>{
    var result= arrayOf(0,0)
    nums.forEachIndexed { index, num ->
        var diff = target - num
       if(nums.contains(diff)){
           result[0] = index
           result[1] = nums.indexOf(diff)
       }
    }
    return result
}

fun targetSum2(nums:Array<Int>,target:Int):Array<Int>{
    val result = arrayOf(-100,-99)
    val seen = HashMap<Int,Int>()
    nums.forEachIndexed{index,num ->
        val diff = target - num
        if(diff in seen.keys){
            result[0] = index
            result[1] = seen[diff]!! //nullable value
        }
        else{
            seen[num] = index
        }
    }
    return result
}

fun frequency(s:String):HashMap<String,Int>{
    var frequency = HashMap<String,Int>()
   var x = s.split(" ")
    for (y in x){
        var count = frequency.getOrDefault(y,0)
        frequency[y] = ++count
    }
    return frequency

}