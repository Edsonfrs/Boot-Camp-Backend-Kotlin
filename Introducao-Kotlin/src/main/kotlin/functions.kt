fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// Inline function
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello2")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println("1 + 2 = " + sum(1, 2))
    println("2 x 4 = " + multiply( 2, 4))

}

