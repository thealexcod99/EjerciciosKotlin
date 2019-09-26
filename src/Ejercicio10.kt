//Crea un programa que pide al usuario una lista de 10 números enteros.
// Posteriormente ordena la lista creando tu propio algoritmo de ordenación e imprime por pantalla la lista demenor a mayor.

fun ordenarMayor(listNum: ArrayList<Int>, cant: Int) {
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

    var listaNumeros = ArrayList<Int>(10)

    println("Introduce 10 números enteros:")
    for (i in 1..10) {
        listaNumeros.add(readLine()!!.toInt())
    }
    ordenarMayor(listaNumeros, listaNumeros.size)
}