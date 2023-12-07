fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {   // Any um "elemento" que pode receber qualquer coisa "any coisa"
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknow")   // Uso como o default em Java, por exemplo
    }
}

class MyClass

