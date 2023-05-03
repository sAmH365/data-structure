package recursion

import java.util.LinkedList

fun main() {
    var target = 3
    var arr = intArrayOf(1, 3, 5, 7, 9)

    val findIndex = BSearch(arr, 0, arr.size - 1, target)

    if (findIndex == -1)
        println("탐색 실패")
    else
        println("target은 ${findIndex}번째 인덱스에 있습니다.")
}

fun BSearch(arr: IntArray, start: Int, last: Int, target: Int): Int {
    var mid = (start + last) / 2

    if (start > last) return -1 // 탐색 실패

    return if (arr[mid] == target) {
        mid
    } else if (arr[mid] < target)  {
        BSearch(arr, mid + 1, last, target)
    } else {
        BSearch(arr, start, mid - 1, target)
    }
}