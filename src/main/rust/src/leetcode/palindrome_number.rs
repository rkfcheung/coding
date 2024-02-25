use crate::Solution;

/*
9. Palindrome Number https://leetcode.com/problems/palindrome-number/
*/
impl Solution {
    pub fn is_palindrome_number(x: i32) -> bool {
        match x {
            n if n < 0 => { false }
            n if n >= 0 && n < 10 => { true }
            _ => {
                let s = x.to_string();

                s == s.chars().rev().collect::<String>()
            }
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_is_palindrome() {
        assert_eq!(Solution::is_palindrome_number(121), true);
        assert_eq!(Solution::is_palindrome_number(-121), false);
        assert_eq!(Solution::is_palindrome_number(10), false);
    }
}