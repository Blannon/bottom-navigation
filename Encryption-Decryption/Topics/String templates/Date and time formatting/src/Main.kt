fun main() {
    // write your code here
    val (a, b, c) = readln().split(' ')
    val (d, e, f) = readln().split(' ')

    val time= ("$a:$b:$c")
    val period =("$d/$e/$f")

    val out = ("$time $period")
    println(out)

}