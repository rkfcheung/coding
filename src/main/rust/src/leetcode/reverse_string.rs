use crate::Solution;

/*
344. Reverse String https://leetcode.com/problems/reverse-string/
*/
impl Solution {
    pub fn reverse_string(s: &mut Vec<char>) {
        let length = s.len();
        if length <= 1 {
            return;
        }

        let mut left = 0;
        let mut right = length - 1;
        while left < right {
            s.swap(left, right);
            left += 1;
            right -= 1;
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_reverse() {
        let mut s = vec!['h', 'e', 'l', 'l', 'o'];
        Solution::reverse_string(&mut s);
        assert_eq!(s, vec!['o', 'l', 'l', 'e', 'h']);

        s = vec!['H', 'a', 'n', 'n', 'a', 'h'];
        Solution::reverse_string(&mut s);
        assert_eq!(s, vec!['h', 'a', 'n', 'n', 'a', 'H']);
    }
}