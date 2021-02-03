fun main(args: Array<String>){
    nullSafety()
}

private fun nullSafety(){
    val nullString: String? = null

    nullString?.let {
        println(nullString)
    } ?: run {
        println(nullString)
    }
}