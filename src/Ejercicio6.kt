import java.util.*

//Mejora el programa anterior de forma que se pase como parámetro
// la función que realiza la comprobación sobre el número leído por teclado.

fun comprobar(numero: Int, fn: (Int) -> Boolean): Boolean {
    return fn(numero)
}

fun entreUnoyDiez(numero: Int) = numero in 1..10

fun main() {

    var variable = true
    val escaner = Scanner(System.`in`)

    println("Introduce un número del 1 al 10")

    while (variable) {
        var numero = escaner.nextInt()
        if (comprobar(numero, ::entreUnoyDiez)) {
            variable = false
            println("El número $numero está comprendido entre 1  y 10")
        } else {
            println("Vuelve a introducir otro número")
        }

    }
}