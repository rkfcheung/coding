package com.rkfcheung.leetcode

/*
202. Happy Number https://leetcode.com/problems/happy-number/
 */
class HappyNumber {
    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()

        return checkHappy(n, seen)
    }

    fun isHappy2(n: Int): Boolean {
        if (n == 1) {
            return true
        }

        fun nextValue(n: Int): Int {
            var result = 0
            var tmp = n
            while (tmp > 0) {
                val r = tmp % 10
                result += r * r
                tmp /= 10
            }

            return result
        }

        var slow = n
        var fast = nextValue(n)
        while (slow != fast) {
            slow = nextValue(slow)
            fast = nextValue(nextValue(fast))
        }

        return slow == 1
    }

    private fun checkHappy(n: Int, seen: MutableSet<Int>): Boolean {
        if (n == 1) {
            return true
        }

        if (seen.contains(n)) {
            return false
        }

        seen.add(n)
        var m = 0
        n.toString().toCharArray().forEach {
            val i = it.digitToInt()
            m += i * i
        }

        return checkHappy(m, seen)
    }
}