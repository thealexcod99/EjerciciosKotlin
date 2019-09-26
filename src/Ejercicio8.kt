//Tenemos que repartir 100 regalos a un auditorio de 1000 personas.
// Cada persona tiene unticket con un número del 1 al 1000.
// Crea un programa para repartir los regalos al azar deforma que no se pueda regalar a una misma persona más de un premio.

fun main() {

    var listaPremios = ArrayList<Int>(100)

    while (listaPremios.size < 100) {
        var numero = (Math.random() * 1000 + 1).toInt()
        if (!(numero in listaPremios))
            listaPremios.add(numero)
    }
    println(listaPremios)
}