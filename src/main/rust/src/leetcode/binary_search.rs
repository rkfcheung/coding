use crate::Solution;

/*
704. Binary Search https://leetcode.com/problems/binary-search/
*/
impl Solution {
    pub fn search(nums: Vec<i32>, target: i32) -> i32 {
        let length = nums.len();
        if length == 0 {
            return -1;
        }

        let mut left = 0;
        let mut right = length as i32 - 1;
        while left <= right {
            let mid = left + (right - left) / 2;
            let n = nums[mid as usize];
            if n == target {
                return mid;
            } else if n < target {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        -1
    }
}

#[cfg(test)]
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

    #[test]
    fn test_nums_len_eq_1() {
        assert_eq!(Solution::search(vec![5], -5), -1);
    }
}