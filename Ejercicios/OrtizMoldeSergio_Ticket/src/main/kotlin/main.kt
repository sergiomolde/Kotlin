import models.Alimentacion
import models.Producto
import models.Ticket
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(args: Array<String>){

    var arrayProductos: ArrayList<Producto> = ArrayList<Producto>()
    insertData(arrayProductos)

    val ticket = Ticket(arrayProductos)
    ticket.imprimirTicket()

}

fun insertData(array: ArrayList<Producto>){
    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val producto1 = Alimentacion(12.60, "Patatas", 1, 2, LocalDate.now())
    val producto2 = Alimentacion(3.40, "Anchoas", 2, 3, LocalDate.parse("07-01-2021", formatter))
    val producto3 = Alimentacion(1.20, "Coca-Cola", 3, 1, LocalDate.now())
    val producto4 = Alimentacion(0.35, "Pipas sal", 4, 5, LocalDate.now())
    val producto5 = Alimentacion(1.0, "Pringles", 5, 2, LocalDate.parse("07-01-2021", formatter))
    val producto6 = Alimentacion(2.10, "Croissant", 6, 1, LocalDate.now())
    array.add(producto1)
    array.add(producto2)
    array.add(producto3)
    array.add(producto4)
    array.add(producto5)
    array.add(producto6)
}