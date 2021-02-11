import kotlin.math.log

class AlumnoEj7(val id: Long, val nombre: String, val apellidos: String, val edad: Int, var asignaturas: MutableMap<Long, Float?>) : IMatricula {

    init {
        this.id
        this.nombre
        this.apellidos
        this.edad
        this.asignaturas = mutableMapOf<Long, Float?>()
    }

    override fun matricularAsignatura(idAsignatura: Long) {
        this.asignaturas.put(idAsignatura, -1f)
        println(this.asignaturas)
    }

    override fun desMatricularAsignatura(idAsignatura: Long) {
        this.asignaturas.remove(idAsignatura)
        println(this.asignaturas)
    }

    override fun evaluarAsignatura(idAsignatura: Long, nota: Float) {
        if (this.asignaturas[idAsignatura] != -1f){
            this.asignaturas[idAsignatura] = (asignaturas[idAsignatura]?.plus(nota))?.div(2)
            println(this.asignaturas)
        }else{
            this.asignaturas[idAsignatura]=nota
            println(this.asignaturas)
        }
    }

    override fun imprimir() {
        println("${nombre} ${apellidos}: ")
        asignaturas.forEach {
            if (it.value != -1f) {
                println("${it.key}: ${it.value}\n")
            } else {
                println("${it.key}: No evaluado\n")
            }
        }
    }

    fun imprimirListadoAlumnosEj8() {

    }
}