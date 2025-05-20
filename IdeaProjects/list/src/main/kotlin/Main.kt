fun main() {
    var color =  listOf("red", "blue", "green", "yellow", "orange")
    var friends = mutableListOf("Ada", "Elsa", "Kate", "Debbie", "Faith")
    friends.add("Diana")
    friends.add("Kelvin")
    println(friends)
    println(color)

    var nums = listOf(32,456, 5, 78,4, 621,34,56,89)
    println(nums.size)
    println(nums.min())
    println(nums.max())

    val student1 = Student ("Anna", 20, 35,"Rwandan")
    var student2 = Student ("Zainab", 21, 98, "Somali")
    var student3 = Student ("Regina", 23, 54,"Kenyan")
    var student4 = Student ("Laila", 20, 81, "Ethiopian")

    var students = listOf(student1, student2, student3,  student4)
    println(students)

    for (student in students){
        println(student.nationality)
    }
   println( oddAges(students))

    //pip assessment
    var bus = Bus ("KCA23",56, 13)
    var passenger = Passenger("Mark", "2334")
    var ticket1 = bus.book(passenger,"Juja", "Karen", "13-05", 23)
    var ticket= bus.book(passenger,"Juja", "Karen", "13-05", 23)
    //bus.printTicket(ticket!!) --> !! ensures the argument is not null
    //!!null assertion operator
    if(ticket != null){
        bus.printTicket(ticket)
    }
    println(bus.takenSeats)

}

data class Student(
    var name:String,
    var age:Int,
    var codehiveNo:Int,
    var nationality:String
)

/* write a function that takes in a list of students and returns a list
* of students whose age is odd.*/

fun oddAges(students:List<Student>):MutableList<Student>{
    var result = mutableListOf<Student>()
    for (student in students){
        if(student.age % 2 != 0){
            result.add(student)
        }
    }
    return result
}

data class Passenger (var name:String, var id:String)
data class Ticket (var name:String, var idNumber:String, var placeOfDeparture:String, var destination:String,
                    var seatNumber: Int, var dateOfTravel:String, var registrationNumber:String , var fare:Double)

class Bus (var regNum:String,var capacity:Int, var bookedSeats:Int){
    var takenSeats = mutableListOf<Int>()
    fun book(passenger:Passenger, departure:String, destination:String, dateOfTravel:String, seatNumber:Int):Ticket?{
        if(bookedSeats < capacity){
            if(takenSeats.contains(seatNumber)){
                println("Seat $seatNumber is already taken.")
                return null
            }
            else{
                takenSeats.add(seatNumber)
                bookedSeats++
                var ticket = Ticket(passenger.name, passenger.id, departure, destination,seatNumber, dateOfTravel,regNum,54.0  )
                return ticket
            }
        }
        return null
    }

    fun printTicket(ticket:Ticket){
        println(ticket)
    }
}
// !!null assertion operator
//