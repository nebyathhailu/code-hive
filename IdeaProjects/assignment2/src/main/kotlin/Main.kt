//1. fun char(variable:String)
//{
//    println("${variable[0]}${variable[2]}${variable[3]}                         ")
//}
//fun main()
//{
//    char("akirachix")
//}

/*
fun main() {
introduction("ana", 23)
}
fun introduction(name:String, age:Int)
{
    var n=println("Hi, my name is $name and I am $age years old. ")
    return n
}
3. fun main()
{
    var greeting=stringLength("Hello, world")
    println(greeting)
}
fun stringLength(variable:String):Int
{
    return variable.length
}


4. fun d(x:String, t:String,c:String ,n:String)
{
    var array= arrayOf("x","t","c","n")
    println(array.contentToString())
}
fun main()
{
    d("fy", "fgh","kjk","ujkk,")
}

*/

//

//6.fun main()
//{
//arithimeticOpertaion()
//}
//fun arithimeticOpertaion()
//{
//var number= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
//    println(number.indexOf(158))
//    val sum=number[1] +number[4]
//    println(sum)
//    println(number.sorted())
//}

//fun main() {correctCase()}
//fun correctCase(){
//    val cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
//
//    // Using forEach to capitalize the first letter of each city
//    cities.forEach { city ->
//        val capitalizedCity = city.replaceFirstChar { it.uppercase() }
//        println(capitalizedCity)
//    }
//}




fun main() {
    val maxUsers = 100
    val usernames = Array<String?>(maxUsers) { null }
    val emails = Array<String?>(maxUsers) { null }
    var userCount = 0

    // Function to add a user only if username and email are unique
    fun addUser(username: String, email: String): Boolean {
        // Check for duplicates
        for (i in 0 until userCount) {
            if (usernames[i] == username) {
                println("Username '$username' already exists.")
                return false
            }
            if (emails[i] == email) {
                println("Email '$email' already exists.")
                return false
            }
        }

        if (userCount < maxUsers) {
            usernames[userCount] = username
            emails[userCount] = email
            userCount++
            println("User added: $username with email $email")
            return true
        } else {
            println("User list is full.")
            return false
        }
    }

    // Function to get username by email
    fun getUsernameByEmail(email: String): String? {
        for (i in 0 until userCount) {
            if (emails[i] == email) {
                return usernames[i]
            }
        }
        return null
    }}






