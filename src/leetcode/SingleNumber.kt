package leetcode

fun singleNumber(nums: IntArray): Int {
    val numsSet = HashSet<Int>()
    for (n in nums) {
        if (numsSet.contains(n)) {
            numsSet.remove(n)
        } else {
            numsSet.add(n)
        }
    }

    return numsSet.elementAt(0)
}
//Optimal solution which take less memory
fun usingBitwiseOperations(nums: IntArray): Int {
    var res = 0
    for (n in nums) {
        res =res  xor n
    }

    return res
}

fun main() {
    val nums = arrayOf(2, 2, 1).toIntArray()
    println(usingBitwiseOperations(nums))
}