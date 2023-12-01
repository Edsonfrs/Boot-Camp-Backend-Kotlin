fun  main() {
    var neverNull: String = "This can't be null"
    //neverNull = null

    var nullable: String? = "You can keep a null here" // Pode ser nulo
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"   // Compilador assume que é não nulo
    //inferredNonNull = null                                // Compilador deixa claro que a variável é não nula
    /*
    fun strLength(notNull: String): Int {
        return notNull.length
    }*/

    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    strLength(neverNull)
    //strLength(nullable)

    println(strLength(neverNull))
    println(strLength(nullable))



}