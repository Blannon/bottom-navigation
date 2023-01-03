fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    // write your code here
    val y = readln().toBoolean()
    val z = readln().toBoolean()
    val d = (!(x && y )|| z)
    println(d)
}