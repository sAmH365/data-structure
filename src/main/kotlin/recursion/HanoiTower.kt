package recursion

class HanoiTower {
}

fun main() {
    hanoiMove(3, "A", "B", "C")
}

fun hanoiMove(num: Int, from: String, by:String, to: String) {
    if (num == 1) println("원반 1을 '${from}' 에서 '${to}' 로 이동")
    else {
        hanoiMove(num-1, from, to, by)
        println("원반 ${num}을 '${from}' 에서 '${to}' 로 이동")
        hanoiMove(num-1, by, from, to)
    }
}