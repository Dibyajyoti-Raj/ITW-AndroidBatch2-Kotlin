import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Starting long-running task...")

    try {
        withTimeout(2000L) { // 2000 milliseconds = 2 seconds
            longRunningTask()
        }
        println("Task completed successfully.")
    } catch (e: TimeoutCancellationException) {
        println("Task was cancelled due to timeout.")
    }

    println("Program finished.")
}

suspend fun longRunningTask() {
    repeat(10) { i ->
        println("Working on task... Step $i")
        delay(500L) // Simulating long-running task with delay
    }
}
