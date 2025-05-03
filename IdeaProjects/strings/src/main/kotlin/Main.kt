//mar 17
//fun main() {
//    val city="Lagos"
//    println("The capital city of Nigeria is $city")
//
//    val person= "Janet"
//    val profession = "architect"
//    println(person + " is an " + profession)
//    println("$person is an $profession")
//}
// write a function that takes in a name and an age and then prints out for example "Joy was born in 2006"
//when given "Joy" and 19

//fun birthDay(name:String, year:Int)
//{
//    println ("$name is born in $year")
//}
fun main() {
  val os = "Ubuntu"
  val s = "ubuntu"
  println(os.equals(s))
  println(os.slice(1..2))
  println(os.uppercase())
  println(os.lowercase())
  val a = ""
  val b = " "
  println(a.isEmpty())
  println(a.isBlank())
  println(b.isEmpty())
  println(b.isBlank())
  val name = " patricia "
  println(name.trim())
  println(name.trimStart())
  println(name.trimEnd())
  val fullName = "Pamela Kolozo"
  println(fullName.startsWith("p"))
  println(fullName.endsWith("zo"))
  var stmt = "Phoebe is our class representative"
  stmt = stmt.replace("Phoebe", "Victoria")
  var word = stmt.split(" ")
  println(word::class.simpleName)
  println(stmt)
  println(word)
  word = stmt.split("c")
  println(word)
}
