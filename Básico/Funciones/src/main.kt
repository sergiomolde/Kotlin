import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>){
    funciones()
}

// Esto no es buena práctica (a mi parecer)
private fun funciones(){
    callMe()
}

private fun callMe(){
    functionParameters("Sergio", 20)
    functionParameters("Fernando", 21)
    println("And the sum of our ages is ${ageSum(20, 21)}")

}

private fun functionParameters(name: String, age: Int){
    println("My name is $name")
    if(name.equals("Sergio")){
        println("I'm $age years 'young' :P")
    } else {
        println("He's/She's $age years old")
    }
}

private fun ageSum(age1: Int, age2: Int): Int{
    return age1 + age2
}

//private fun birthdayToday(age: Long): String? {
//    val formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")
//    var fechaYHoraLocal = LocalDateTime.parse(LocalDateTime.now().toString(), formateador)
//    fechaYHoraLocal = fechaYHoraLocal.minusYears(age.toLong())
//    return fechaYHoraLocal.format(formateador)
//}
