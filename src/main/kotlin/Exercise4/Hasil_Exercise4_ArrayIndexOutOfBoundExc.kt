package Exercise4

fun accessArrayElement(arr: Array<Int>, index: Int): Int {
    return arr[index]
}

fun main() {
    val arr = arrayOf(1, 2, 3)

    try {
        val element = accessArrayElement(arr, 5)
        println("Elemen: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Indeks diluar batas array: ${e.message}")
    } finally {
        println("Eksekusi blok finally")
    }
}