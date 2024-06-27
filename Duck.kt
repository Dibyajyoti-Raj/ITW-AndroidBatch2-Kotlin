fun main() {
    var x = 78596
    var ck = 0
    var c=0
    while (x != 0) {
        var temp = x % 10
        if(temp == 0)
        ck =1
        
        x/=10
    	c++
    }
//     print("$c ")
//     var i =0  
    var s = x.toString()
    for(i in 0 until s.length-1)
    {
        if(s[i] == '0')
        {
//             i++
            ck = 0
            continue
        }
        ck = 1
        break
    }
    
   if(ck == 1)
   print("This is a Duck Number.")
   else
    print("This is not a Duck Number.")
}
