import Main.Companion.count
import Main.Companion.sb
import java.lang.StringBuilder
import java.util.Scanner

class Main {
    companion object {
        var count = 0
        var sb = StringBuilder()
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    sc.close()

    hanoi(input, 1, 2, 3)
    sb.insert(0, "${count}\n")
    println(sb)
}

fun hanoi(n: Int, from: Int, by: Int, to: Int) {
    if (n == 1) {
        ++count
        sb.append("$from ${to}\n")
    } else {
        ++count
        hanoi(n - 1, from, to, by)
        sb.append("$from ${to}\n")
        hanoi(n - 1, by, from, to)
    }
}




