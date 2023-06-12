package Exercise1

fun main () {

    val firstName = "Ibnah"
    println (firstName)

    val lastName: String = "Syathiroh"
    println (lastName)

    val age: Int = 20
    println (age)

    var single = false
    var nikah = true
    println("single && nikah = " + (single || nikah)) // true
    println("single  nikah = " + (single && nikah)) //false
    println("single = " + (!single))
}