fun main() {
    // put your code here
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()
    val d = h2 <= h1 && h2 >= h3 || h2 >= h1 && h2 <= h3
    println(d)
}