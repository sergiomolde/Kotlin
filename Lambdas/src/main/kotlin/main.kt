class Impresora{

    fun imprimir(elem: Int): Unit = println(elem)

}

fun main(args: Array<String>){

    val lista = listOf(1,4,2,7,5,4,3,9,8,7,0)
    val suma = lista.fold(0) { x,y -> x+y}
    val producto = lista
        .filter { it > 0}
        .fold(1) { x,y -> x*y}

    lista
        .filter{ it in 2..4}
        .forEach(::println)
//        .forEach { elem -> println(elem) }
//        .forEach{println(it)}
}