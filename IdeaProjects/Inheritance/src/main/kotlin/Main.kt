fun main() {
    var banker = Banker("Kelly",23)
    banker.sleep()
    banker.talk("I am rich.")
    banker.sleep()
    banker.eat()
    var moneyOwned = banker.countMoney(arrayOf(100,300,679))
    println("moneyOwned: $moneyOwned")
    banker.earnSalary(3000.0)

    //doctor instance, instantiating
    var doctor = Doctor("Anna", 32)
    doctor.talk("How are you feeling today?")
    doctor.eat()
    doctor.sleep()
    doctor.treatPatient("Jane","malaria")
    doctor.earnSalary(5000.0)

    //farmer
    var farmer = Farmer("Mark", 32)
    farmer.talk("What a nice summer!")
    farmer.eat()
    farmer.sleep()
    farmer.cultivateLand()

    //class work
    var car = Cars("Subaru","Legacy","White",5)
    car.carry(6)
    car.carry(4)
    car.identity()
    println(car.calculateParkingFees(3))

    var bus = Bus ("Scania","Mitsubishe","Blue",30)
    bus.carry(30)
    bus.carry(45)
    bus.identity()
    println(bus.calculateParkingFees(3))
    println(bus.maxTripFare(20.0))
}
class Banker(name:String,age:Int): Employee(name,age){
//    fun talk(words:String){
//        println(words)
//    }
//
//    fun eat(){
//        println("yum")
//    }
//
//    fun sleep(){
//        println("zzzzz")
//    }
    fun countMoney(notes:Array<Int>):Int{
        var sum = 0
        notes.forEach{
            note -> sum +=note
        }
        return sum
    }
}

class Doctor( name:String,  age:Int):Employee(name,age){
//    fun talk(word:String){
//        println(word)
//    }
//
//    fun eat(){
//        println("yum")
//    }
//
//    fun sleep(){
//        println("zzzz")
//    }

    fun treatPatient(patient:String,illness:String){
        println("treating $patient for $illness")
    }

}

class Farmer( name:String,  age:Int):Person(name,age){
//    fun talk(word:String){
//        println(word)
//    }
//
//    fun eat(){
//        println("yum")
//    }
//
//    fun sleep(){
//        println("zzzz")
//    }
    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
//        super.eat()
        println("I am enjoying the food of my labour.")
    }
}

open class Person(var name:String, var age:Int) {
    fun talk(word: String) {
        println(word)
    }

    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzz")
    }

}

open class Employee( name:String, age:Int):Person(name,age){
    fun earnSalary(amount:Double){
        println("I have earned $amount this time.")
    }
}

//there is no multiple inheritance in kotlin. we use hierarchy. parent class == supper class == base class
// we extend or inherit classes, we can override a function in parent classes

//class work
 open class Cars(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people < capacity){
            println("Carrying $people passengers")
        }
        else{
            var x =  people - capacity
            println("Over capacity by $x people")
        }
    }

    fun identity(){
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours:Int):Int{
        return hours * 20
    }
}

class Bus( make:String, model:String, color:String, capacity:Int):Cars(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare * capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}