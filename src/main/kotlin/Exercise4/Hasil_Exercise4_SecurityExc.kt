package Exercise4

fun readFile(filePath: String) {
    val file = java.io.File(filePath)

    try {
        val content = file.readText()
        println("Isi file: $content")
    } catch (e: SecurityException) {
        println("Terjadi kesalahan keamanan: ${e.message}")
    } finally {
        println("Eksekusi blok finally")
    }
}

fun main() {
    val filePath = "path/to/secure/file.txt"

    readFile(filePath)
}