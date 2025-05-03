import kotlin.math.pow

//fun main() {
//  var  subaru = Car ("Subaru", "Impreza", "KDQ 134T", 0)
//    println(subaru.registration)
//    println(subaru.model)
//    subaru.start()
//    println(subaru.speed)
//    subaru.accelerate(32)
//    println(subaru.speed)
//    subaru.deceleration(8)
//    println(subaru.speed)
//    subaru.stop()
//    println(subaru.speed)
//    var tv=Television()
//    tv.channel="KBC"
//    println(tv.channel)
//    val x=1
//    println(tv.switchOn())
//    val myShoe = Shoe ("Nike","white",40,"sneakers")
//    var shoes= Shoe('Hush puppies',"Black",43,"oxford")
//    var nums=arrayOf(1,3,4,5)
//    println(calculate(nums))
//    var b= arrayOf("semere","ber","berhe")
//    println(names(b))
//}
//
//class Car(var make:String ,var model:String, var registration: String, var speed:Int)
//{
//    fun start()
//    {
//        println("vrooom")
//    }
//    fun accelerate(acceleration:Int)
//    {
//        speed += acceleration
//    }
//    fun hoot()
//    {
//     println("beep beep")
//    }
//    fun deceleration(deceleration:Int)
//    {
//        speed-=deceleration
//    }
//    fun stop()
//    {
//        speed-=speed
//    }
//}
//
//class Television(){
//    var channel=""
//    fun switchOn():Int{
//return 0;
//    }
//    fun switchOff(){
//
//    }
//}
//data class Shoe(
//    var brand:String,
//    var color:String,
//    var size:Int,
//    var style:String
//)

//write a function that returns the average , minimum and maximum value from an integer array
//data class Values(var minimum:Int, var maximum:Int , var average:Int)
//fun calculate(integer:Array<Int>):Values{
//    // integer.max(), integer.min(),integer.average()
//    var sum=0
//    for(i in integer){
//        sum+=i
//    }
//    var n=integer.max()
//    var avg=sum/integer.size
//    var sortedInteger=integer.sortedArray()
//    var output = Values ( sortedInteger[0],sortedInteger[sortedInteger.size-1],avg)
//    return output
//}

// from my friend group I would like to find out who has the longest and shortest name and return -> minBy{it->it.length}
//data class Name(var longestName:String,var shortestName:String)
//fun names(string:Array<String>):Name{
//    var i=0
//    var shortest = string[i]
//    var longest = string[i]
//    while (i<string.size-1){
//
//        if(string[i]>string[i+1]){
//            shortest =string[i+1]
//        }
//        i++
//    }
//    while (i<string.size-1){
//        if(string[i]<string[i+1]){
//            longest =string[i+1]
//        }
//        i++
//    }
//    var a= Name(longest,shortest)
//    return a
//}
//fun findLongestAndShortestString(arrayOfNames:Array<Int>){
//    var shortest=arrayOfNames[0]
//    for (name in arrayOfNames)
//        if(shortest.length > name.length){
//            shortest=name
//        }
//    }
//}
import java.util.Calendar
fun main(){
    var doctor= Doctor("Mark William",290,"Dentist", 2015,200)
    println(doctor.name)
    println(doctor.registrationNumber)
    println(doctor.specialization)
    println(doctor.yearOfGraduation)
    println(doctor.numberOfPatientsTreated)
    doctor.introduction()
    doctor.treatPatient("Tom","Tooth ache")
    doctor.ranking()
}
class Doctor(var name:String, var registrationNumber:Int, var specialization:String, var yearOfGraduation:Int, var numberOfPatientsTreated:Int){
    fun introduction() {
       println("Name:${name} Specializaion:${specialization} Graduation Year:${yearOfGraduation} ")
   }
    fun treatPatient(patient:String,illness:String) {
        println("Dr. ${name} treated ${patient}  who was suffering from ${illness}.")
        numberOfPatientsTreated++
    }
    fun ranking(){
        print("A ${specialization} with ${Calendar.getInstance().get(Calendar.YEAR)-yearOfGraduation} years of experience.")
    }
}
