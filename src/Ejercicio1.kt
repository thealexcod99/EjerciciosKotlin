//Implementa un programa que imprima en consola los  primeros  100 números  primos.
//Recuerda que un número primo es aquel que sólo es divisible por 1 y él mismo.


fun main() {

    var contador: Int = 0
    var numero: Int = 2
    var primo = true

    while (contador < 101) {
        for (i in 2..numero/2) {
            if (numero % i == 0) {
                primo = false
                break
            } else
                primo = true
        }

        if (primo) {
            println(numero)
            contador++
        }

        numero++
    }


}