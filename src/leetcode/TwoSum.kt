package leetcode


fun twoSum(nums: IntArray, target: Int): IntArray {
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
}

fun main() {
   val arr= intArrayOf( 2,7,11,15)
    twoSum(arr,9).forEach {
        println(it)
    }
}