// Classe Pessoa representa um indivíduo com altura e sexo
class individuo(val altura: Double, val sexo: String)

fun main() {
    // lista chamada "pessoas" com 10 objetos do tipo "Pessoa".
    // Cada objeto representa uma pessoa com altura e sexo.
    val pessoas = mutableListOf<individuo>()

    // Solicitamos os dados de 10 pessoas
    for (i in 1..10) {
        println("Digite a altura da pessoa $i (em metros):")
        val altura = readLine()?.toDoubleOrNull() ?: 0.0
        // lerá a entrada do usuário para a altura e convertemos para Double.
        // Se a entrada não for válida, aí vai o valor padrão 0.0.

        println("Digite o sexo da pessoa $i (feminino/masculino):")
        val sexo = readLine()?.toLowerCase() ?: ""
        // lerá a entrada do usuário para o sexo , convertendo para minúsculas.
        // Se a entrada for nula, vai ser uma string vazia.

        pessoas.add(individuo(altura, sexo))
        // um objeto individuo com os valores lidos e adicionei à lista.
    }

    // a) Encontrando a maior e a menor altura do grupo
    val maiorAltura = pessoas.maxByOrNull { it.altura }?.altura //pega o valor maximo
    val menorAltura = pessoas.minByOrNull { it.altura }?.altura //pega o valor mininmo

    println("Maior altura: ${maiorAltura ?: "N/A"}")
    println("Menor altura: ${menorAltura ?: "N/A"}")

    // b) Calculando a média de altura dos homens
    val alturasHomens = pessoas.filter { it.sexo == "masculino" }.map { it.altura }// aqui filtra aqueles que o it se direciona ao objeto todo aquele que o sexo for masculino
    //A função map transforma cada elemento de uma coleção de acordo com uma função fornecida.

    val mediaAlturaHomens = alturasHomens.average() //A função average() é usada para calcular a média dos valores em uma coleção numérica.

    println("Média de altura dos homens: ${mediaAlturaHomens}")

    // c) Contando o número de mulheres
    val numMulheres = pessoas.count { it.sexo == "feminino" } //A função count conta o número de elementos que atendem a uma determinada condição.
    println("Número de mulheres: $numMulheres")
}
//Lembretes do biel
//It representa cada elemento da coleção (lista) sobre a qual a função está sendo aplicada. e nesse caso, quando uso pessoas.filter { it.sexo == "masculino" }, o it se refere a cada objeto do tipo Pessoa na lista pessoas.