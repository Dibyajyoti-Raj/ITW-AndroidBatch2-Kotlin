fun main(){
    var myList :List<Int> = listOf()
    println(myList)
    
    var myList2 :List<Int> = emptyList<Int>()
    println(myList2)
//     println(myList2[1])
    
    var myList3 :MutableList<Int> = mutableListOf<Int>()
    println(myList3.size)
}