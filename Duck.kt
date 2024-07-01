fun main() {
    var f = -1
//     var m = -1
    val s = 9893245
    var x = s.toString()
    for(i in 0 until x.length)
    {
        
        var t = x[i]
        if(t != '0' && f == -1)
        	f = 0
        else if(f == 0 && t == '0')
        {f = 1
            break}
        
    }
    
   if(f == 1)
   print("This is a Duck Number.")
   else
    print("This is not a Duck Number.")
}