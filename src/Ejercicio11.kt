import java.io.File

//Mejora el programa anterior de forma que la lista de números está almacenada en un fichero.
// El programa acepta como primer argumento la ruta de dicho fichero.
// Controla los posibles errores.

fun main() {
    var lineas: List<String> = (File("/rutaAbsoluta").readLines())

}