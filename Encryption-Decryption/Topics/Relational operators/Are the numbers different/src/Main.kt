fun main() {
    // put your code here
    val a = readln().toBoolean()
    val b = readln().toBoolean()
    val c = readln().toBoolean()

    val d = a != b != c || a <= b <= c || a>= b>= c
    println(d)
}