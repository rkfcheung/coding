/*
412. Fizz Buzz https://leetcode.com/problems/fizz-buzz/
*/
use crate::Solution;

impl Solution {
    pub fn fizz_buzz(n: i32) -> Vec<String> {
        let mut result = Vec::new();
        for i in 1..=n {
            result.push(
                if i % 3 == 0 && i % 5 == 0 {
                    "FizzBuzz".to_string()
                } else if i % 3 == 0 {
                    "Fizz".to_string()
                } else if i % 5 == 0 {
                    "Buzz".to_string()
                } else {
                    i.to_string()
                }
            );
        };
        
        result
    }

    pub fn fizz_buzz_match(n: i32) -> Vec<String> {
        (1..=n).map(|i| match (i % 3, i % 5) {
            (0, 0) => "FizzBuzz".to_string(),
            (0, _) => "Fizz".to_string(),
            (_, 0) => "Buzz".to_string(),
            _ => i.to_string(),
        }).collect()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_value_eq_3() {
        let expected = vec!["1".to_string(), "2".to_string(), "Fizz".to_string()];

        assert_eq!(Solution::fizz_buzz(3), *expected);
        assert_eq!(Solution::fizz_buzz_match(3), *expected);
    }

    #[test]
    fn test_value_eq_5() {
        let expected = vec![
            "1".to_string(),
            "2".to_string(),
            "Fizz".to_string(),
            "4".to_string(),
            "Buzz".to_string(),
        ];

        assert_eq!(Solution::fizz_buzz(5), *expected);
        assert_eq!(Solution::fizz_buzz_match(5), *expected);
    }

    #[test]
    fn test_value_eq_15() {
        let expected = vec![
            "1".to_string(),
            "2".to_string(),
            "Fizz".to_string(),
            "4".to_string(),
            "Buzz".to_string(),
            "Fizz".to_string(),
            "7".to_string(),
            "8".to_string(),
            "Fizz".to_string(),
            "Buzz".to_string(),
            "11".to_string(),
            "Fizz".to_string(),
            "13".to_string(),
            "14".to_string(),
            "FizzBuzz".to_string(),
        ];

        assert_eq!(Solution::fizz_buzz(15), *expected);
        assert_eq!(Solution::fizz_buzz_match(15), *expected);
    }
}
