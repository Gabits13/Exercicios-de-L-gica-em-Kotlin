//Classe computador
open class Computador(
    val marca: String,
    val fabricante: String,
    val memoria: Memoria
){
    //fun ligar
    fun ligar(){
        println("Computador ligado!")
    }
}

//class Memoria

class Memoria (
    val capacidade: Int

)
//metodo leitura da memoria

fun leitura(){
    println("Realizando leitura da memória...")
}

//metodo escrita da memoria

fun escrita(){
    println("Realizando escrita na memória...")
}
// Classe Notebook herda de Computador
class Notebook(
    marca: String,
    fabricante: String,
    memoria: Memoria,
    val espessura: Int
) : Computador(marca, fabricante, memoria) {
    // Método específico para dobrar a tela do notebook
    fun dobrarTela() {
        // Implementação do método dobrarTela
        println("Tela do notebook dobrada!")
    }
}

// Classe Desktop também herda de Computador
class Desktop(
    marca: String,
    fabricante: String,
    memoria: Memoria,
    val marcaGabinete: String
) : Computador(marca, fabricante, memoria) {
    // Método para ligar o monitor do desktop
    fun ligarMonitor() {

        println("Monitor do desktop ligado!")
    }
}

//exemplo
fun main() {
    val memoria1 = Memoria(capacidade = 8) // Criando uma memória com capacidade de 8 GB
    val notebook1 = Notebook(marca = "Dell", fabricante = "XYZ", memoria = memoria1, espessura = 15)
    notebook1.ligar() // Ligar o notebook
    notebook1.dobrarTela() // Dobrar a tela do notebook

    val memoria2 = Memoria(capacidade = 16) // Criando outra memória com capacidade de 16 GB
    val desktop1 = Desktop(marca = "HP", fabricante = "ABC", memoria = memoria2, marcaGabinete = "ATX")
    desktop1.ligar() // Ligar o desktop
    desktop1.ligarMonitor() // Ligar o monitor do desktop

    // Exibindo informações
    println(" ")
    println("Notebook:")
    println("Marca: ${notebook1.marca}")
    println("Fabricante: ${notebook1.fabricante}")
    println("Memória: ${notebook1.memoria.capacidade} GB")
    println("Espessura: ${notebook1.espessura} mm")

    println("\nDesktop:")
    println("Marca: ${desktop1.marca}")
    println("Fabricante: ${desktop1.fabricante}")
    println("Memória: ${desktop1.memoria.capacidade} GB")
    println("Marca do gabinete: ${desktop1.marcaGabinete}")
}