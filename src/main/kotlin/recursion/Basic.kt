package recursion

class Basic {
}

fun main() {
    recursive(3)
}

fun recursive(num: Int) {
    if (num <= 0) // 재귀 탈출 조건
        return
    else {
        println("recursive call $num")
        recursive(num - 1)
    }
}