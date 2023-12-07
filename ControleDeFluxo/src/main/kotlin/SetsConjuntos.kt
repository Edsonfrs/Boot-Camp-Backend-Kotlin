// Set: Estruturas de dados não ordenados. Não permitem duplicidade dentre os seus elementos
// setOf: cria conjuntos de dados (sets) imutáveis
// mutableSetOf : cria conjunto de dados (sets) mutáveis


val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                                                             // 2
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr7"
    //val aNewIssue2: String = "Nova"
    val anIssueAlreadyIn: String = "uniqueDescr3"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
}