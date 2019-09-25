//Crea un programa que calcule el factorial de un número.
//Haz una versión iterativa y otra recursiva.

fun main() {

    val numero = 5

    if (numero >= 0)
        println("El factorial de $numero es ${calcularFactorial(numero)}")
    else
        println("Los numeros negativos no tienen factorial")

}

fun calcularFactorial(numero: Int) :Int {
    if (numero == 0) return 1
    var contador = numero
    var resultado = numero
    while (contador > 1) {
        resultado *=  --contador

    }

    return resultado
}