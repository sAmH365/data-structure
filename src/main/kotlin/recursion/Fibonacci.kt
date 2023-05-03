package recursion

class Fibonacci {
}

fun main() {
    for (i in 1 .. 23) {
        print("${fibo(i)} ")
    }
}

fun fibo(num: Int) : Int {
    if (num == 1) return 0
    else if (num == 2) return 1
    else {
        return fibo(num - 1) + fibo(num-2)
    }
}