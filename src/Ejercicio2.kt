import java.util.*

//Crea un programa que convierta una cantidad en euros que se pide al usuario a bitcoins.
//Usala clase Scanner de java para leer de la entrada estándar.

fun main() {
    val bitcoinsAEuros = 8877.58
    val escaner = Scanner(System.`in`)

    println("Introduce la cantidad de euros a convertir: ")
    val euros = escaner.nextDouble()

    println("$euros euros son ${euros/bitcoinsAEuros} bitcoins")
}