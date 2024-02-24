/*
704. Binary Search https://leetcode.com/problems/binary-search/
*/
use crate::Solution;

impl Solution {
    pub fn search(nums: Vec<i32>, target: i32) -> i32 {
        let length = nums.len();
        if length == 0 {
            return -1;
        }

        let mut left = 0;
        let mut right = length - 1;
        while left <= right {
            let mid = (right - left) / 2 + left;
            let n = nums[mid];
            if n == target {
                return mid as i32;
            } else if n < target {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        -1
    }
}

mod tests {
    use super::*;

    #[test]
    fn test_exists() {
        let nums = vec![-1, 0, 3, 5, 9, 12];

        assert_eq!(Solution::search(nums, 9), 4);
    }

    #[test]
    fn test_not_exists() {
        let nums = vec![-9, -1, 0, 3, 5, 9, 12];

        assert_eq!(Solution::search(nums, 13), -1);
    }
}