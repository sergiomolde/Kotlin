interface IMatricula {

    fun matricularAsignatura(idAsignatura: Long)

    fun desMatricularAsignatura(idAsignatura: Long)

    fun evaluarAsignatura(idAsignatura: Long, nota: Float)

    fun imprimir()

}