package leetcode

import java.util.Arrays

import java.util.ArrayList

/*fun twoSumUsingHashing(nums: IntArray, target: Int): IntArray {
    var sums = hashMapOf<Int, Int>()
    val arr = IntArray(2)
    nums.forEachIndexed { index, element ->
        val pair = target - element
        if (sums.containsKey(pair)) {

            arr[0]= index
            arr[1]= sums.get(pair)!!
        } else {
            sums[element] = index
        }
    }
    return arr
}*/
fun threeSum(nums: IntArray?): MutableList<MutableList<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    if (nums == null || nums.isEmpty()) return result
    var count = 0
    Arrays.sort(nums)
    for (i in 0 until nums.size - 2) {
        count = nums[i]
        if (i == 0 || nums[i] > nums[i - 1]) {
            var start = i + 1
            var end: Int = nums.size - 1
            while (start < end) {
                if (nums[start] + nums[end] + count === 0) {
                    val arrayList = ArrayList<Int>()
                    arrayList.add(nums[start])
                    arrayList.add(nums[end])
                    arrayList.add(count)
                    result.add(arrayList)
                }
                if (nums[start] + nums[end] + count < 0) {
                    val currentStart = start
                    while (nums[start] === nums[currentStart] && start < end) {
                        start++
                    }
                } else {
                    val currentEnd = end
                    while (nums[end] === nums[currentEnd] && start < end) {
                        end--
                    }
                }
            }
        }
    }
    return result
}

fun twoSumUsingTwoPointers(nums: IntArray, target: Int, targetIndex: Int): List<Int> {
    var low = 0
    var high = nums.size - 1

    while (low < high && (targetIndex != high)) {
        val sum = nums[low] + nums[high]
        if ((sum + target) == 0) {
            return listOf(nums[low], nums[high])
        } else if (sum > 0) high--
        else low++
    }
    return listOf()
}

fun main() {
    val arr = intArrayOf(-1, 0, 1, 2, -1, -4)
    threeSum(arr).forEachIndexed { index, list ->
        list.forEachIndexed { index, i ->
            println(i)
        }
    }
}