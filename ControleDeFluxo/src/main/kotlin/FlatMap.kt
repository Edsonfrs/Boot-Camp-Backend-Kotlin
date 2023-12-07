fun main()
{
    val fruitsBag = listOf("Apple", "Orange", "Banana", "Grapes")
    val clothesBag = listOf("Shirts", "Pants", "Jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}