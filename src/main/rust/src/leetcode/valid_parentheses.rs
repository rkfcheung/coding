use std::collections::HashMap;

use crate::Solution;

/*
20. Valid Parentheses https://leetcode.com/problems/valid-parentheses/
*/
impl Solution {
    pub fn is_valid(s: String) -> bool {
        let map: HashMap<char, char> = vec![
            ('(', ')'),
            ('[', ']'),
            ('{', '}'),
        ].into_iter().collect();
        let mut stack: Vec<char> = Vec::new();
        for c in s.chars() {
            if let Some(found) = map.get(&c) {
                stack.push(*found);
            } else if stack.pop() != Some(c) {
                return false;
            }
        }

        stack.is_empty()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_is_palindrome() {
        assert_eq!(Solution::is_valid("()".to_string()), true);
        assert_eq!(Solution::is_valid("()[]{}".to_string()), true);
        assert_eq!(Solution::is_valid("(]".to_string()), false);
    }
}