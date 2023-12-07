// Lista: Estrutura de dados ordenada
// Uma lista pode ser mutável ou imutável. A definição do tipo é feita no momento da instanciação da mesma
// listOf: sempre cria listas read-only - imutaveis
// mutableListOf: sempre cria listas mutáveis

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUsers(4)
    addSystemUsers(5)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }
    //getSysSudoers().add(6) //<- Error!
}