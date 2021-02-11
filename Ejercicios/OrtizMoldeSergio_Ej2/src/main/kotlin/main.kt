fun main(args: Array<String>){
    ejercicio06()
    ejercicio07()
    ejercicio10()
    ejercicio09()
}


fun ejercicio06(){
    val alumno1: AlumnoEj6 = AlumnoEj6("Sergio", "Ortiz Molde", 20, 5)
    val alumno2: AlumnoEj6 = AlumnoEj6("Antonio", "Hernandez Valero", 20, 10)
    val alumno3: AlumnoEj6 = AlumnoEj6("Carlos Javier", "Chamorro Sánchez", 20, 6)
    var listaAlumnos: Array<AlumnoEj6> = arrayOf(alumno1, alumno2, alumno3)
    println("*** EJERCICIO 6 ***")
    listaAlumnos.forEach {
        when{
            it.notaFinal >= 0 && it.notaFinal <= 4 -> println("${it.nombre} ${it.apellidos}: Insuficiente")
            it.notaFinal == 5 -> println("${it.nombre} ${it.apellidos}: Suficiente")
            it.notaFinal == 6 -> println("${it.nombre} ${it.apellidos}: Bien")
            it.notaFinal >= 7 && it.notaFinal <= 8 -> println("${it.nombre} ${it.apellidos}: Notable")
            it.notaFinal >= 9 && it.notaFinal <= 10 -> println("${it.nombre} ${it.apellidos}: Sobresaliente")
        }
    }
}

fun ejercicio07(){

    println("*** EJERCICIO 7 ***")
    val alumno1: AlumnoEj7 = AlumnoEj7(1, "Sergio", "Ortiz Molde", 20, mutableMapOf())
    val alumno2: AlumnoEj7 = AlumnoEj7(2, "Antonio", "Hernandez Valero", 20, mutableMapOf())
    val alumno3: AlumnoEj7 = AlumnoEj7(3, "Carlos Javier", "Chamorro Sánchez", 20, mutableMapOf())

    val asignatura1: Asignatura = Asignatura(1, "Biología")
    val asignatura2: Asignatura = Asignatura(2, "Plástica")
    val asignatura3: Asignatura = Asignatura(3, "Geografía")

    // Añadiendo asignaturas
    println("Matriculando Asignaturas \n")
    alumno1.matricularAsignatura(asignatura2.id)
    alumno2.matricularAsignatura(asignatura1.id)
    alumno3.matricularAsignatura(asignatura3.id)

    // Borrando asignaturas
    println("Desmatriculando Asignaturas \n")
    alumno1.desMatricularAsignatura(asignatura2.id)

    // Evaluando Asignaturas
    println("Evaluando Asignaturas \n")
    alumno2.evaluarAsignatura(asignatura1.id, 7.5f)
    alumno3.evaluarAsignatura(asignatura3.id, 6.3f)

    // Imprimir
    println("Imprimiendo Asignaturas \n")
    alumno2.imprimir()
    alumno3.imprimir()
}

fun ejercicio08(){

}

fun ejercicio09(){
    println("Hola, indícame el id del alumno")
    var idAlumno = readLine()?.toLong() as Long
    println(idAlumno)
}

fun ejercicio10() {
    println(" EJERCICIO 10 ")
    var idAsignatura: Long = 1

    val alumno1: AlumnoEj7 = AlumnoEj7(1, "Sergio", "Ortiz Molde", 20, mutableMapOf())
    val alumno2: AlumnoEj7 = AlumnoEj7(2, "Antonio", "Hernandez Valero", 20, mutableMapOf())
    val alumno3: AlumnoEj7 = AlumnoEj7(3, "Carlos Javier", "Chamorro Sánchez", 20, mutableMapOf())

    var array: Array<AlumnoEj7> = arrayOf(alumno1, alumno2, alumno3)

    array.forEach{
        it.matricularAsignatura(idAsignatura)
    }
}

