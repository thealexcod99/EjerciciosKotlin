import java.util.*

//Convertir una cadena a mayúsculas, minúsculas o capitalizada en función de la elección del usuario.

fun main() {

    val escaner = Scanner(System.`in`)

    println("Introduce una cadena")
    var cadena = escaner.nextLine()
    println("Elige una opción")
    println("1 -> Todo a mayúscula")
    println("2 -> Todo a minúsculas")
    println("3 -> Capitalizar")
    println("Cualquiera -> Salir")

    var opcion = escaner.nextInt()

    if (opcion == 1)
        println(cadena.toUpperCase())
    if (opcion == 2)
        println(cadena.toLowerCase())
    if (opcion == 3) {
        println(cadena.capitalize())
    } else
        System.exit(1)
}