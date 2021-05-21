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

fun main() {
    val nums = arrayOf(2, 2, 1).toIntArray()
    println(singleNumber(nums))
}