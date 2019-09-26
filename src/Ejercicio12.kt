import java.io.File
import java.util.ArrayList

//Implementa un programa que cuente el número de veces que aparece una letra (parámetro de entrada) en un fichero de texto.

fun contarCaracter(list: List<String>, caracter: Char): Int {
    var arrayChar = CharArray(0)
    var contador = 0

    for (i in list.indices) {
        arrayChar = list[i].toCharArray()
        for (j in arrayChar.indices) {
            if (arrayChar[j].toLowerCase() == caracter.toLowerCase())
                contador++
        }
    }
    return contador
}

fun main() {

    var lineas: List<String> = File("D:\\Desktop\\DAM\\IntelliJproyects\\EjerciciosKotlin\\src\\buscarCaracter.txt").readLines()
    val caracter = 'e'
    println(contarCaracter(lineas, caracter))

}