use std::collections::HashMap;

use crate::Solution;

/*
1. Two Sum https://leetcode.com/problems/two-sum/
*/
impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        if nums.len() <= 1 {
            return vec![-1, -1];
        }

        let mut dict: HashMap<i32, i32> = HashMap::new();
        for (i, n) in nums.iter().enumerate() {
            let comp = target - *n;
            if let Some(found) = dict.get(&comp) {
                return vec![*found, i as i32];
            }
            dict.insert(*n, i as i32);
        }

        vec![-1, -1]
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_two_sum() {
        assert_eq!(Solution::two_sum(vec![2, 7, 11, 15], 9), vec![0, 1]);
        assert_eq!(Solution::two_sum(vec![3, 2, 4], 6), vec![1, 2]);
        assert_eq!(Solution::two_sum(vec![3, 3], 6), vec![0, 1]);
    }
}