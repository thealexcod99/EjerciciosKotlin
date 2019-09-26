import java.io.File

//Mejora el programa anterior de forma que la lista de números está almacenada en un fichero.
// El programa acepta como primer argumento la ruta de dicho fichero.
// Controla los posibles errores.
fun ordenarMayorMenor(listNum: ArrayList<Int>, cant: Int) {
    var tmp = 0
    for(i in 0 until cant) {
        for(j in 0 until cant) {
            if(listNum[i] > listNum[j]) {
                tmp = listNum[i]
                listNum[i] = listNum[j]
                listNum[j] = tmp
            }
        }
    }
    println("\nArray ordenado: $listNum")
}

fun main() {
    var lineas: List<String> = (File("D:\\Desktop\\DAM\\IntelliJproyects\\EjerciciosKotlin\\src\\listaNumeros.txt").readLines())

    var listaNumeros = ArrayList<Int>(0)

    println("Introduce 10 números enteros:")
    for (i in 0 until lineas.size) {
        listaNumeros.add(lineas[i].toInt())
    }
    ordenarMayorMenor(listaNumeros, listaNumeros.size)

}