fun main()
{
    println("Enter size of array.")
    var x = readLine() ?: "5"
    val n = x.toInt()
    
    val r = sum(n)
    println("Sum of list = $r")
    
}

fun sum(n: Int):Int{
    val arr = Array<Int>(n){0}
    var x = "0"
    for(i in arr.indices)
    {
        println("enter element ${i+1}")
        x = readLine() ?: "1"
        var a = x.toInt()
        arr[i] = a
    }
    
    var r = 0
    for(i in 0..n-1)
    {
        r += arr.get(i)
    }
    return r
} 


