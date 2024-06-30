fun main() {
    var numList1 = mutableListOf(1, 2, 3, 4, 5)
    var numList2 = mutableListOf( 2, 3)
    val r:String?  = subset(numList1,numList2)
    println("List2 is a subset of List1: $r")
}

fun subset(nl1: MutableList<Int>, nl2: MutableList<Int>):String
{
   if(nl2.all { it in nl1 })
   	return "Yes"
   else
    return "No"
}