import IPerson

class Person(private val data: PersonData) {

    fun introduction(): String{
        return "Hello my name is ${data.name} ${data.surname} and i am ${data.age} years old"
    }

    fun calculateAge(birthYear: Int): Int = 2020 - birthYear

    override fun returnAge(birthYear: Int): Int = 2020 - birthYear
}