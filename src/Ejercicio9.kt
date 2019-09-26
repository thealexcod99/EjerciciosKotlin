//Inicializa un array con 2000 números enteros aleatorios entre el 1 y el 100.
// Crea tus propias funciones para calcular el mínimo, máximo y la media del array.
// Calcula la moda (el valorque más veces se repite en el array).
// Calcula la frecuencia de aparición de cada número.

fun calcularMinimo(lista: ArrayList<Int>) : Int {
    var minimo = 101
    for (i in lista) {
        if (i < minimo)
            minimo = i
    }
    return minimo
}

fun calcularMaximo(lista: ArrayList<Int>) : Int {
    var maximo = 0
    for (i in lista) {
        if (i > maximo)
            maximo = i
    }
    return maximo
}

fun calcularMedia(lista: ArrayList<Int>) : Double {
    var suma = 0
    for (i in lista)
        suma += i

    return suma / 2000.0
}

fun calcularModa(lista: ArrayList<Int>) : Int {
    var maxRepeticiones = 0
    var moda = 0

    for (i in lista) {
        var numRepeticiones = 0
        for (j in lista) {
            if (lista[i] == lista[j])
                numRepeticiones++
            if (numRepeticiones > maxRepeticiones) {
                moda = lista[i]
                maxRepeticiones = numRepeticiones
            }
        }
    }
    return moda
}

fun calcularFrecuencia(lista: ArrayList<Int>) : ArrayList<String> {
    var resultado = ArrayList<String>(0)

    for (i in 1..100) {
        var numRepeticiones = 0
        for (j in lista) {
            if (i == lista[j])
                numRepeticiones++


        }
        if (numRepeticiones != 0)
            resultado.add(i.toString() + " se repite " + numRepeticiones + " veces")
    }

    return resultado
}

fun main() {
    var listaNumeros = ArrayList<Int>(2000)

    for (i in 1..2000)
        listaNumeros.add((Math.random() * 100+1).toInt())

    println("El mínimo es ${calcularMinimo(listaNumeros)}, el máximo es ${calcularMaximo(listaNumeros)} y la media es ${calcularMedia(listaNumeros)}")
    println("La moda es ${calcularModa(listaNumeros)}")
    println(calcularFrecuencia(listaNumeros))


}