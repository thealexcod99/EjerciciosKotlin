import java.util.*

//Implementa una función que lea un número por teclado y comprueba que dicho número está entre 0 y 10 incluidos.
//Si se inserta otro número se vuelve a pedir el número.

fun main() {

    var variable = true
    val escaner = Scanner(System.`in`)

    println("Introduce un número del 1 al 10")

    while (variable) {
        var numero = escaner.nextInt()
        if (numero in 1..10) {
            variable = false
            println("El número $numero está comprendido entre 1  y 10")
        } else {
            println("Vuelve a introducir otro número")
        }

    }
}