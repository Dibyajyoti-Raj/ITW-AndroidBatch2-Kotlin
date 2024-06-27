fun main() {
    var x = 123
    var r = 0
    var c = x
    
    var p = 0
    while (x > 0) { 	
        p++
        x /= 10
    }
    x = c
    println("p = $p")
    
    while (x != 0) {
        var a = x % 10
        r += Math.pow(a.toDouble(), p.toDouble()).toInt()
        x /= 10
    }
    println("r = $r")
    
    if (r == c)
        println("Armstrong number")
    else
        println("Not an Armstrong number")
}
