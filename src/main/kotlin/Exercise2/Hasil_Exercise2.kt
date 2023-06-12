package Exercise2

fun main() {

    //* Latihan 1
    val evenNumbers = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }
    println(evenNumbers)


    //* Latihan 2
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "June"
    val birthMonth = "April"
    val message = "It's $monthNow now, I was born in $birthMonth"
    println(message)
}