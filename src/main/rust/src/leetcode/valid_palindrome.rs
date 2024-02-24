use crate::Solution;

/*
125. Valid Palindrome https://leetcode.com/problems/valid-palindrome/
*/
impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let t: String = s.chars()
                            .filter(|c| c.is_ascii_alphanumeric())
                            .map(|c| c.to_ascii_lowercase())
                            .collect();
        let r: String = t.chars().rev().collect();
        
        t == r
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_is_palindrome() {
        assert_eq!(Solution::is_palindrome("A man, a plan, a canal: Panama".to_string()), true);
        assert_eq!(Solution::is_palindrome("race a car".to_string()), false);
        assert_eq!(Solution::is_palindrome( " ".to_string()), true);
    }
}