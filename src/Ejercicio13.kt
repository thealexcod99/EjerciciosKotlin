import java.io.File

//Crea un programa que indique la posición de la primera ocurrencia de una palabra en un fichero de texto.

fun encontrarOcurrencia(list: List<String>, ocu: String) : String {
    var linea = 0
    var posicion = 0

    for (i in list.indices) {
        var listaPalabras: List<String> = list[i].split(" ")

        for (j in listaPalabras.indices) {
            if (listaPalabras[j].toLowerCase() == ocu.toLowerCase()) {
                linea = i + 1
                posicion = j + 1
                break
            }
        }
        if (linea != 0)
            break
    }
    return "La palabra \"$ocu\" está en la línea $linea y en la posición $posicion"
}

fun main() {
    var lineas: List<String> = File("D:\\Desktop\\DAM\\IntelliJproyects\\EjerciciosKotlin\\src\\buscarCaracter.txt").readLines()

    println(encontrarOcurrencia(lineas, "buscar"))


}
