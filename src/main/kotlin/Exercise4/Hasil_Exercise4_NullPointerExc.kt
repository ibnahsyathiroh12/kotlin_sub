package Exercise4

fun calculateStringLength(text: String?): Int {
    return text!!.length
}

fun main() {
    try {
        val text: String? = null
        val length = calculateStringLength(text)
        println("Panjang string: $length")
    } catch (e: NullPointerException) {
        println("Terjadi NullPointerException: ${e.message}")
    } finally {
        println("Eksekusi blok finally")
    }
}