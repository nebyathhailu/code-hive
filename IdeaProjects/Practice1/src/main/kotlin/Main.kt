import kotlin.math.pow

fun main()
{

    var car = Cars("Subaru","Legacy","White",5)
    car.carry(7)
    car.carry(4)
    car.identity()
    var parkingHours = 4
    var parkingFee = car.calculateParkingFees(parkingHours)
    println("The parking fee for $parkingHours hours is $parkingFee shilling. ")

    var bus = Bus ("Scania","Mitsubishe","Blue",30)
    bus.carry(30)
    bus.carry(45)
    bus.identity()
    parkingHours = 3
    parkingFee = bus.calculateParkingFees(3)
    println("The parking fee for ${bus.capacity} people for $parkingHours hours is $parkingFee ")
    var tripFare = bus.maxTripFare(20.0)
    println("The total fare from ${bus.capacity} people is $tripFare shilling.")

    var num = arrayOf(6,8,9,5,4)
    num.forEach{ x ->
        var y=x+5
        println(y)
        println(print)
        var name="Jull"
        println("Hi, ${name[0]}")
        var v= getFullName("vio","blu")
        println(v)
    }
    println(add(6,9))

    var programmingLanguages = arrayOf("js","kotlin","java","ruby","python", "go")
    programmingLanguages[5] = "rust"
    println(programmingLanguages.contentToString())
    var string:String? = ""
    for (programmingLanguage in programmingLanguages){
        string+="$programmingLanguage "
          }
    println(string)
    programmingLanguages.forEach{programmingLanguage ->
        println(programmingLanguage)
    }
    programmingLanguages.forEachIndexed{
        index,programmingLanguage -> if(index==0){
            println(programmingLanguage)
    }
    }

    var trainers = mutableMapOf("kotlin" to "John", "python" to "James", "js" to "Hunter")
    trainers.put("das","Sharon")
    trainers.forEach{course,trainer -> println("$trainer is $course instructor.") }
    greeting(*programmingLanguages)

    var person = Person("Peter",30)
}

fun greeting( vararg itemToGreet:String) {
    itemToGreet.forEach{item -> println("Hello $item")}
}
open class Cars(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people <= capacity){
            println("Carrying $people passengers")
        }
        else{
            var x =  people - capacity
            println("Over capacity by $x people")
        }
    }

    fun identity(){
        println("I am a $color $make $model.")
    }

    open fun calculateParkingFees(hours:Int):Int{
        return hours * 20
    }
}

class Bus( make:String, model:String, color:String, capacity:Int): Cars(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        return fare * capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}

class Person(var name:String, var age:Int){
    init{
        println("init 1")
    }
}

    val toUpperCase = "kotlin".uppercase()
    val toLowerCase = "KOTLIN".lowercase()

    var num = 3
    var print = when {
        num>20 -> "greater"
        num==23 -> "exact number"
        else -> "none"
}

fun add():String
{
    var a="Beki"
    var b="Mani"
    return "$a & $b"
}
fun getFullName(firstName: String, lastName: String):String{
    var fullName = firstName + " " + lastName
    return fullName
}


    fun generateAnswer(){
        val count = 25

        val answerString= when {
            count ==24 -> " you got the answer"
            count != 24 -> "you missed the answer"
            else -> "none"
        }
 return println (answerString)
    }

/*  VOLUME OF A SPHERE AND TOTAL PRICE*/
fun volume(d:Double,a:Double):Double{
    val p = 3.1415
    var r = d/2
    var exponent = 3
    val radius = r.pow(3)
    var v = 4/3 * p * radius
    var totalVolume = v * a
    return totalVolume
}
fun price(volume1:Double, volume2:Double):Double{
   val totalPrice = (volume1 + volume2)* 16.83 * 10e-6
    return totalPrice
}


fun checker(x:String){
    var password = "noeler"
    var password1 = password.lowercase().toCharArray().sortedArray().contentToString()
    var y =x.lowercase().toCharArray().sortedArray().contentToString()
    println(y)
    println(password1)
    if(password1 === y){
        println("invalid")
    }
    else{
        println("Good to go")
    }
}

fun add(a:Int,b:Int ):Int = a +b




