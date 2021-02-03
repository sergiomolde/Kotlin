fun main(args: Array<String>){
    println(personaClass())
    println()
}


private fun personaClass(): String?{
    val sergioData = PersonData("Sergio", "Ortiz Molde", 20)
    val sergio = Person(sergioData)

    return sergio.introduction()
}

