class BankAccount {
    
    var accountNumber: Int = 0
    var balance: Double = 0.0
    
    fun deposit(amount: Double) {
        balance += amount
    }
    
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("You don't have enough funds to withdraw the amount")
        }
    }
    
    fun displayTransactions() {
        println("Amount in account number $accountNumber is $balance")
    }
}

fun main() {
    // Initialize the array with instances of BankAccount
    val accounts = Array(3) { BankAccount() }
    
    // Perform operations on the first account
    accounts[0].deposit(895963.50630)
    accounts[0].deposit(88965.26)
    accounts[0].displayTransactions()
    accounts[0].withdraw(500000.0)
    accounts[0].displayTransactions()
}
