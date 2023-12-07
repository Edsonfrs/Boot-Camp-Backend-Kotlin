fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    val pairs = numbers2.filter { x -> x % 2 == 0 }
    val odds = numbers2.filter { x -> x % 2 != 0  }

    println("Numbers: $numbers")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")
    println()
    println("Numbers2: $numbers2")
    println("Pairs: $pairs")
    println("Odds $odds")
}