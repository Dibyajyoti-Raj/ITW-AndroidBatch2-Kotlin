fun main()
{
    println("Enter the string.")
    var s = readLine() ?: "asdfdsa"
    Palaindrome(s)
    
}

fun Palaindrome(s: String){
    var x: String ?= ""
    val n = s.length
    for(i in 0..n-1)
    {
        x += s[i]
    }
    println(x)
    if(x == s)
    println("This string is palindrome.")
    else
    println("This string is not Palindrome.")
}