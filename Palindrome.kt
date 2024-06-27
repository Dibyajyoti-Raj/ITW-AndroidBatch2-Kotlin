fun main(){
    var x = 12321
    var a=0
    var X = x
    while(x > 0)
    {
         a += x%10
        a *= 10
        x/=10
    
    }
    println("a=${a/10}")
    if((a/10) == X)
    println("Palindrom number")
    else
    println("Not a palindrom number")
}
