// Classe base para representar uma pessoa
open class Pessoa {
    protected var nome: String = ""
    protected var endereco: String = ""
    protected var telefone: String = ""
    protected var bairro: String = ""
    protected var CEP: Long = 0
    protected var cidade: String = ""
    protected var estado: String = ""

    fun obterNome(): String {
        return nome
    }

    fun settNome(value: String) {
        nome = value
    }

    fun obterEndereco(): String {
        return endereco
    }

    fun settEndereco(value: String) {
        endereco = value
    }

    fun obterTelefone(): String {
        return telefone
    }

    fun settTelefone(value: String) {
        telefone = value
    }

    fun obterBairro(): String {
        return bairro
    }

    fun settBairro(value: String) {
        bairro = value
    }

    fun obterCEP(): Long {
        return CEP
    }

    fun settCEP(value: Long) {
        CEP = value
    }

    fun obterCidade(): String {
        return cidade
    }

    fun settCidade(value: String) {
        cidade = value
    }

    fun obterEstado(): String {
        return estado
    }

    fun settEstado(value: String) {
        estado = value
    }
}

// Classe que herda de Pessoa e representa uma pessoa física
class PessoaFisica : Pessoa() {
    private var CPF: Long = 0
    private var RG: String = ""

    fun obterCPF(): Long {
        return CPF
    }

    fun settCPF(value: Long) {
        CPF = value
    }

    fun obterRG(): String {
        return RG
    }

    fun settRG(value: String) {
        RG = value
    }
}

// Classe que herda de Pessoa e representa uma pessoa jurídica
class PessoaJuridica : Pessoa() {
    private var CNPJ: Long = 0

    fun obterCNPJ(): Long {
        return CNPJ
    }

    fun settCNPJ(value: Long) {
        CNPJ = value
    }
}

fun main() {
    val pessoaFisica = PessoaFisica()
    pessoaFisica.settNome("Gabriel Santos")
    pessoaFisica.settEndereco("Rua do Japão, 13")
    pessoaFisica.settTelefone("(11) 95494-3200")
    pessoaFisica.settBairro("Parque Penha")
    pessoaFisica.settCEP(123456)
    pessoaFisica.settCidade("São Paulo")
    pessoaFisica.settEstado("SP")
    pessoaFisica.settCPF(12345678900)
    pessoaFisica.settRG("1234567-X")

    val pessoaJuridica = PessoaJuridica()
    pessoaJuridica.settNome("Empresa: Google")
    pessoaJuridica.settEndereco("Av. Paulista, 123")
    pessoaJuridica.settTelefone("(11) 98765-4321")
    pessoaJuridica.settBairro("Centro")
    pessoaJuridica.settCEP(987654)
    pessoaJuridica.settCidade("São Paulo")
    pessoaJuridica.settEstado("SP")
    pessoaJuridica.settCNPJ(12345678000129)

    println("Pessoa Física:")
    println("Nome: ${pessoaFisica.obterNome()}")
    println("CPF: ${pessoaFisica.obterCPF()}")
    println("RG: ${pessoaFisica.obterRG()}")
    println("Endereço: ${pessoaFisica.obterEndereco()}")
    println("Telefone: ${pessoaFisica.obterTelefone()}")
    println("Bairro: ${pessoaFisica.obterBairro()}")
    println("CEP: ${pessoaFisica.obterCEP()}")
    println("Cidade: ${pessoaFisica.obterCidade()}")
    println("Estado: ${pessoaFisica.obterEstado()}")

    println("\nPessoa Jurídica:")
    println("Nome: ${pessoaJuridica.obterNome()}")
    println("CNPJ: ${pessoaJuridica.obterCNPJ()}")
    println("Endereço: ${pessoaJuridica.obterEndereco()}")
    println("Telefone: ${pessoaJuridica.obterTelefone()}")
    println("Bairro: ${pessoaJuridica.obterBairro()}")
    println("CEP: ${pessoaJuridica.obterCEP()}")
    println("Cidade: ${pessoaJuridica.obterCidade()}")
    println("Estado: ${pessoaJuridica.obterEstado()}")
}