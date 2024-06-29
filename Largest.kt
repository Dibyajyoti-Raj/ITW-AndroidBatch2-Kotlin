fun main()
{
    println("Enter two numbers to compare.")
    var x = readLine() ?: "85"
    val a = x.toInt() 
    x = readLine() ?: "72"
    val b = x.toInt()
    println("${compare(a,b)} is Greater.")
}

fun compare(a: Int,b:Int):Int{
    if(a>b)
    return a
    return b
} 




























