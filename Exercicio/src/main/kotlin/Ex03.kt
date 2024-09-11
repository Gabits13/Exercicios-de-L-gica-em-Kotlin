fun main() {
    println("Programa de Conversao de Celsius para Farenheit e Kelvin")
    println("Digite a temperatura em graus Celsius:")
    val celsius = readLine()!!.toDouble()
    val conversor = Temperatura(celsius)
    val fahrenheit = conversor.celsiusParaFahrenheit()
    val kelvin = conversor.celsiusParaKelvin()
    println("Temperatura em Celsius: $celsius")
    println("Temperatura em Fahrenheit: $fahrenheit")
    println("Temperatura em Kelvin: $kelvin")
}

class Temperatura(val celsius: Double) {
    fun celsiusParaFahrenheit(): Double {
        return celsius * 1.8 + 32
    }

    fun celsiusParaKelvin(): Double {
        return celsius + 273.15
    }
}
