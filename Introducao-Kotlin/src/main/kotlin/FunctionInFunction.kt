fun main() {


    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }


    printAll("Hello", "Hallo", "Hola", "Saluton")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }


    printAllWithPrefix(
        " Hello", " Hallo", " Salut", " Hola", " Saluton",
        prefix = "Greetings"
    )



    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("Azathoth", "Cthulhu", "Dagon", "Shub-Niggurath", "Nyarlathotep", "Yog-Sothoth")


}