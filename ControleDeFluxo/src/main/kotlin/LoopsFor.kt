// Loops like for

fun  main() {

    //val cakes = listOf("carrot", "cheese", "chocolate")

    val starships = listOf("Discovery One", "Gunstar", "Nostromo","Bird of Prey","Millenium Falcon",
                    "USS Enterprise NCC 1701", "USS Sulaco", "EA Agamenon", "Sharlin","ISA Excalibur",
                    "Galactica")

    /*
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

     */

    for (starship in starships) {
        println("All hands on deck!!! The starship... $starship!")
    }

    for(i in 0 until 5) {
        print(i)
    }

}
