fun main(){
    var str: String?
    println("Enter a string.\n")
    str = readLine() ?: "qwerty"
    val x = ckeckString(str)
    print(x)
}

fun ckeckString(str: String?):Int{
    return str?.length ?: -1
}