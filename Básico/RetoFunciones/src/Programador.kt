import ProgramadorInterface
class Programador(): ProgramadorInterface {

    private fun getName(): String = "Sergio"
    private fun getAge(): Int = 20
    private fun getLanguage(): String = "Java"

    override fun getProgrammerData(): ProgrammerData {
        return ProgrammerData(getName(), getAge(), getLanguage())
    }

}