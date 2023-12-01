fun someCondition() = false

fun main() {

    var a: String = "Initial"   //1
    a = "Final"
    var d = "New Initial"
    println(a)

    val b: Int = 1              //2
    println(b)
    val c = 3                   //3
    val c2 = 6.89
    println(c)
    println(c2)
    println(d)

    val f: Int

    if (someCondition()) {
        f = 1
    } else {
        f =2
    }

    println(f)


}