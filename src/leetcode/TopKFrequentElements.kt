package leetcode

import java.util.*

//https://leetcode.com/problems/top-k-frequent-elements/
fun topKFrequentElemnt(nums: IntArray, k: Int): IntArray {
    val numbersMap: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        numbersMap[nums[i]] = numbersMap.getOrDefault(nums[i], 0) + 1
    }
    // Using a maxHeap to auto-sort the EntrySet according to the occurences of elements,
    // so we need to Override the compare method (Using  Lambda Expression)
    // Using a maxHeap to auto-sort the EntrySet according to the occurences of elements,
    // so we need to Override the compare method (Using  Lambda Expression)
    val maxHeap = PriorityQueue { a: Map.Entry<Int, Int>, b: Map.Entry<Int?, Int> -> b.value - a.value }
    for (entry in numbersMap.entries) {
        maxHeap.add(entry)
    }


    val result = IntArray(k)
    var counter = 0
    while (counter < k) {
        // poll the number with largest frequency currently.
        val entry: Map.Entry<Int, Int> = maxHeap.poll()
        result[counter] = entry.key
        counter++
    }



    return result
}

fun main() {
    val arr = intArrayOf(2, 2, 3, 1, 1, 1)
    val result = topKFrequentElemnt(arr, 2)
    for (i in result) {
        println(i)
    }
}