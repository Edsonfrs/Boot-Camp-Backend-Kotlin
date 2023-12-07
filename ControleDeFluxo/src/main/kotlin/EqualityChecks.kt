fun main() {
    val authors = setOf("Shakeaspera", "Allan Poe", "Lovercraft")
    val writers = setOf("Lovercraft", "Shakeaspera", "Allan Poe"  )

    println( authors == writers)
    println( authors === writers)
}