
fun main(args: Array<String>){
    ejercicio01()
    ejercicio02()
    ejercicio03()
//    ejercicio04()
    ejercicio05()
}

fun ejercicio01(){
    println("*** EJERCICIO 1 ***")
    var num1 = 3
    var num2 = 3
    when{
        num1 > num2 -> println("Resultado: $num1 es mayor que $num2")
        num2 > num1 -> println("Resultado: $num2 es mayor que $num1")
        else -> {
            println("Resultado: Los dos números son iguales")
        }
    }
}

fun ejercicio02(){
    println("*** EJERCICIO 2 ***")
    var array: Array<Int> = arrayOf(1,6,2,7,9,23,5,3)
    var arrayNuevo = ArrayList<Int>()
    array.sort()
    array.forEach { arrayNuevo.add(it) }
    println("Resultado: $arrayNuevo")
}

fun ejercicio03(){
    println("*** EJERCICIO 3 ***")
    var alumno1: Alumno = Alumno("Sergio", "Ortiz", 20)
    var alumno2: Alumno = Alumno("Antonio", "Hernandez", 20)
    var alumno3: Alumno = Alumno("Carlos", "Chamorro", 20)
    var alumnosArray: Array<Alumno> = arrayOf(alumno1, alumno2, alumno3)
    alumnosArray.sortWith(compareBy( {it.apellidos}, { it.nombre }))
    var contador = 0
    for(alumno in alumnosArray){
        contador++
        println("Resultado: $contador ${alumno.apellidos} ${alumno.nombre}")
    }
}

// No he conseguido realizar este ejercicio, aquí va mi intento.
fun ejercicio4(num1: Int){
    println(" EJERCICIO 4 ")
    var numeroEnTextoReves=num1.toString().reversed()
    var contador=-1
    var arrayNumeros: ArrayList<String> = ArrayList<String>()
    for (letra in numeroEnTextoReves) {
        contador++
        if (contador%3==0 && contador!=0){
            arrayNumeros.add(".")
        }
        arrayNumeros.add(letra.toString())
    }

    for ( letra in arrayNumeros.asReversed()){
        print(letra)
    }
}

fun ejercicio05(){
    println("*** EJERCICIO 5 ***")
    var capicua = 1221

    if(capicua.toString() == capicua.toString().reversed()){
        println("Resultado: ¡Si es capicúa! :)")
    } else {
        println("Resultado: No es capicúa :(")
    }
}