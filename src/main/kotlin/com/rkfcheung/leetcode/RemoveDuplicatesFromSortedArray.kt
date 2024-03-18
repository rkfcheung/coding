package com.rkfcheung.leetcode

/*
26. Remove Duplicates from Sorted Array https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var i = 1
        var j = 1
        val n = nums.size
        while (j < n) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j]
            }
            j += 1
        }

        return i
    }
}