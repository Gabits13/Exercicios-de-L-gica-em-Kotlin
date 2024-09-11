fun main() {

    println("Digite seu nome completo:")
    val nomecompleto = readLine() ?: ""
    println("Seu nome completo é: $nomecompleto")
    println("Seu último nome é: ${nomecompleto.lastName()}")
}

fun String.lastName(): String{
    val ultimonome = this.split(" ")
    return ultimonome.lastOrNull() ?: ""
}