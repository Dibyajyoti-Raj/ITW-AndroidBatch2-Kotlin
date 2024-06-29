*class bankAccount(var accountHolder : String, var balance : Double){
    
    private val transaction = mutableListOf<String>()
    
    fun deposit(amount:Double){
        balance += amount
        transaction.add("$accountHolder deposited $$amount")
    }
    
    fun withdraw(amount:Double){
        if(amount <= balance)
        {
            //can withdraw
            balance -= amount
            transaction.add("$accountHolder withdrawed the $amount.")
        }
        else
        {
            println("You don't have the fund to withdraw the  amoney")
        }
    }
    fun displayTransactions()
    {
        print("TRansaction history are: ")
        for(item in transaction)
        {
            println(item)
        }
    }
}

fun main() {
//  val myBankAccount = bankAccount("Ruxtz", 17500.0)   
//  println(myBankAccount.accountHolder)
//  myBankAccount.deposit(2000.0)
//  myBankAccount.withdraw(5000.00)
//  myBankAccount.displayTransactions()
//  println("Present bank amount: ${myBankAccount.balance}")
    
    val numbers: Array<Int> = Array(100) { it + 1 } 
    for(i in numbers)
    println(i)
}