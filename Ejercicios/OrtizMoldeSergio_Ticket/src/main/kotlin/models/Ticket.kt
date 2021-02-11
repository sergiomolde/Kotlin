package models


class Ticket(val listaProductos: ArrayList<Producto>) {

    fun imprimirTicket(){
        println("\t\tSupermercados Yoli")
        println("\t\tc/ Lopez de Gomara\n")
        println("Cajero: Sergio Ortiz Molde")
        println("=======================================")
        println("CAN. \t NOMBRE \t\t\t\t PRECIO \t TOTAL")

        listaProductos.forEach{
            if(it is Alimentacion){
                println("${it.cantidad}\t\t ${it.nombre}\t\t\t\t ${it.precio}\t\t ${it.precio * it.cantidad}")
                it.productoACaducar()

            } else {
                println("${it.cantidad}\t\t ${it.nombre}\t\t\t\t ${it.precio}\t\t ${it.precio * it.cantidad}")
            }
        }
        println("=======================================")
        println("\t\t¡Gracias por su visita!")
    }
}