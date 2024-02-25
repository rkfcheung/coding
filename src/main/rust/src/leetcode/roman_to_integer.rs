use std::collections::HashMap;

use crate::Solution;

/*
13. Roman to Integer https://leetcode.com/problems/roman-to-integer/
*/
impl Solution {
    pub fn roman_to_int(s: String) -> i32 {
        let map: HashMap<char, i32> = vec![
            ('I', 1),
            ('V', 5),
            ('X', 10),
            ('L', 50),
            ('C', 100),
            ('D', 500),
            ('M', 1000),
        ].into_iter().collect();
        let mut num = 0;
        let mut prv = 0;
        for c in s.chars().rev() {
            let cur = *map.get(&c).unwrap();
            if cur < prv {
                num -= cur;
            } else {
                num += cur;
            }

            prv = cur;
        }

        num
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_to_int() {
        assert_eq!(Solution::roman_to_int("III".to_string()), 3);
        assert_eq!(Solution::roman_to_int("LVIII".to_string()), 58);
        assert_eq!(Solution::roman_to_int("MCMXCIV".to_string()), 1994);
    }
}