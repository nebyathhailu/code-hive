//
//    fun main() {
//        val candidates = listOf("Alice", "Bob", "Charlie")
//        val votes = mutableMapOf<String, Int>()
//        candidates.forEach { votes[it] = 0 }
//        println("Candidates: ${candidates.joinToString(", ")}")
//        print("Enter your vote: ")
//        val vote = "Alice"
//        if (vote in candidates) {
//            votes[vote] = votes[vote]!! + 1
//            println("Vote counted for $vote")
//        } else {
//            println("Invalid candidate.")
//        }
//        println("Results:")
//        votes.forEach { (name, count) -> println("$name: $count") }
//    fun main() {
//    val students = listOf("Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace")
//    val busCapacity = 3
//    val buses = students.chunked(busCapacity)
//
//    println("Bus Routing System:")
//    for ((i, bus) in buses.withIndex()) {
//        println("Bus ${i + 1}: ${bus.joinToString(", ")}")
//    }
//}
//
//
//
//    data class Node(
//        val name: String,
//        val wheelchairAccess: Boolean = false,
//        val edges: MutableList<Edge> = mutableListOf()
//    )
//    data class Edge(val toNode: Node, val timeCost: Int)
//    fun dijkstra(startNode: Node, maxTime: Int): Map<String, Int> {
//        val times = mutableMapOf(startNode.name to 0)
//        val visited = mutableSetOf<String>()
//        val heap = java.util.PriorityQueue(compareBy<Pair<Int, Node>> { it.first })
//        heap.add(0 to startNode)
//        while (heap.isNotEmpty()) {
//            val (currentTime, node) = heap.poll()
//            if (node.name in visited) continue
//            visited.add(node.name)
//            for (edge in node.edges) {
//                val time = currentTime + edge.timeCost
//                if (time <= maxTime && (edge.toNode.name !in times || time < times[edge.toNode.name]!!)) {
//                    times[edge.toNode.name] = time
//                    heap.add(time to edge.toNode)
//                }
//            }
//        }
//        return times
//    }



//import kotlin.math.*
fun main(){
    var student1 = Student("Alice", arrayOf(70.0,89.0,97.0))
    var student2 = Student("Mark", arrayOf(90.0,89.0,97.0))
    var student3= Student("Bob", arrayOf(70.0,80.0,97.0))
    var students = listOf(student1,student2, student3)
    println(studentStatics(students))
}

data class Student(var name:String, var scores:Array<Double>)

fun studentStatics(students:List<Student>):Any{
    var studentRecord = mutableMapOf<String,Any>()
    for(student in students){
        var studentData = mutableMapOf<String,Any>()
        var studentAverage = average(student.scores)
        var minimum = min(student.scores)
        var maximum = max(student.scores)
        studentData["average"]= studentAverage
        studentData["minimum"]= minimum
        studentData["maximum"]= maximum
        studentRecord[student.name] = studentData
    }
    return studentRecord
}

fun average(scores: Array<Double>): Any {
    var total = 0.0
    for (score in scores){
    total += score

}
    return total/scores.size
}

fun min(scores: Array<Double>): Any{
    var minimum = scores[0]
    for(i in 0 until scores.size-1){
        if (scores[i] > scores[i+1] ){
            minimum = scores[i+1]
        }
    }
    return minimum
}

fun max(scores: Array<Double>): Any{
    var maximum = scores[0]
    for(i in 0 until scores.size-1){
        if (scores[i] < scores[i+1] ){
            maximum = scores[i+1]
        }
    }
    return maximum
}

