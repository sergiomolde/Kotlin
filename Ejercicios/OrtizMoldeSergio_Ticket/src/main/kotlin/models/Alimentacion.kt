package models

import java.time.LocalDate
import java.util.*

class Alimentacion(precio: Double, nombre: String, codigo: Long, cantidad: Int, val diasCaducidad: LocalDate) : Producto(precio, nombre, codigo, cantidad) {

    fun productoACaducar(){
        val diferencia = LocalDate.now().dayOfYear - this.diasCaducidad.dayOfYear
        when{
            diferencia >= 2 -> println("¡El producto '${this.nombre}' está a punto de caducar!")
        }
    }

}