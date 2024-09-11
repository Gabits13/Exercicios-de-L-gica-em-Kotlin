fun main() {

  println("Digite seu nome completo:")
  val nomecompleto = readLine() ?: ""
    println("Seu nome completo é: $nomecompleto")
    println("Seu primeiro nome é: ${nomecompleto.firstName()}")
}

fun String.firstName(): String{
    val primeironome = this.split(" ")
    return primeironome.firstOrNull() ?: ""
}