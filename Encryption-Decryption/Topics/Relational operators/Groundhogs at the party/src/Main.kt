fun main() {
    // write your code here
    val a = readln().toInt()
    val b = readln().toBoolean()

    if (a in 10..20 && !b ){
        println(true)
    }else println((a in (15..25)) && b)
}