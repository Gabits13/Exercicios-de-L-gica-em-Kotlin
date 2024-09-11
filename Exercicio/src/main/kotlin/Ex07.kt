open class Carro {
    val cor: String = "Azul Marinho"
    val modelo: String = "Chevrolet Onix Premier"
    val motor: String = "V8"
    val ano: Int = 2023
    val chassi: Int = 9871

    fun ligarCarro() {
        println("\nCarro ligado")
    }

    fun acelerar() {
        println("Acelerando o carro")
    }

    fun frearCarro() {
        println("Freando o carro")
    }

    fun mudarMarcha() {
        println("Mudando a marcha")
    }

    fun brecar() {
        println("Brecando")
    }

    fun exibirInformacoes() {
        println("Marca do carro: $modelo")
        println("Motor: $motor")
        println("Ano: $ano")
        println("Chassi: $chassi")
    }
}

class CarroAnfibio : Carro() {
    val cor1: String = "Preto"
    val modelo1: String = "Jet ski Subaquatico"
    val motor1: String = "V12"
    val ano1: Int = 2021
    val chassi1: Int = 1892

    fun acelerarNaAgua() {
        println("Acelerando na água")
    }

    fun exibirInformacoes1() {
        println("Marca do carro anfíbio: $modelo1")
        println("Motor anfíbio: $motor1")
        println("Ano do carro anfíbio: $ano1")
        println("Chassi do carro anfíbio: $chassi1")
    }
}

class CarroTerrestre : Carro()

class TestarCarro {
    fun main() {
        val carroAnfibio = CarroAnfibio()
        println("\nCarro Anfíbio:")
        carroAnfibio.exibirInformacoes1()
        carroAnfibio.ligarCarro()
        carroAnfibio.acelerarNaAgua()
        carroAnfibio.mudarMarcha()
        carroAnfibio.brecar()

        val carroTerrestre = CarroTerrestre()
        println("\nCarro Terrestre:")
        carroTerrestre.exibirInformacoes()
        carroTerrestre.ligarCarro()
        carroTerrestre.acelerar()
        carroTerrestre.frearCarro()
        carroTerrestre.mudarMarcha()
        carroTerrestre.brecar()
    }
}

fun main() {
    TestarCarro().main()
}
