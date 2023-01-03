fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    // write your code here
    val gift = readln().toBoolean()

    val pass = invitation && gift
    println(pass)
}