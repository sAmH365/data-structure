package recursion

fun main() {
    val num = 0

    val result = facto(num)

    println("${num}! 의 값은 = $result")
}

fun facto(num: Int): Int {
    return if (num == 0) 1
    else num * facto(num - 1)
}