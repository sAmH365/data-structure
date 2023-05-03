//package recursion
//
//fun main() {
//    val arr = arrayListOf(4,2,6,7,44,10,31)
//
//    selectionSort(arr, arr.size - 1)
//
//    println(arr)
//}
//
//fun selectionSort(arr: ArrayList<Int>, n: Int): ArrayList<Int> {
//    var max = 0
//    var index = 0
//    var temp = 0
//
//    if (n > 1) {
//        // 전체 원소중 가장 큰값을 찾기
//        for (i in 0 until arr.size) {
//            if (arr[i] > max) {
//                index = i
//                max = arr[i]
//            }
//        }
//
//        // 마지막으로 보내기
//        temp = arr[arr.size - 1]
//        arr[arr.size - 1] = max
//        arr[index] = temp
//
//
//        selectionSort(arr, n - 1)
//    }
//
//    return arr
//}