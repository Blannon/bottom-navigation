package encryptdecrypt
fun main() {
    fun encrypt(message: String): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        var encryptedMessage = ""
        for (char in message) {
            if (char == ' ' || char == '!') {
                encryptedMessage += char
            } else {
                encryptedMessage += alphabet[25 - alphabet.indexOf(char)]
            }
        }
        return encryptedMessage
    }

    val message = "we found a treasure!"
    val encryptedMessage = encrypt(message)
    println(encryptedMessage)
}
