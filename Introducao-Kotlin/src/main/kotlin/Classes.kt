class Customer

class Contact(val id: Int, var email: String) // Val = imutável Var = mutável

fun main() {
    val customer = Customer()   // <== Criação de um objeto tipo Costumer. Instanciação do objeto

    val contact = Contact(1, "mary@gmail.com")
    val contact2 = Contact(2, "john@gmail.com")

    println("${contact.id} / ${contact.email}")
    println("${contact2.id} / ${contact2.email}")
    println()
    contact.email = "jane@gmail.com"

    println(contact.id)
    println(contact.email)
}