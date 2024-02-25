use crate::Solution;

/*
7. Reverse Integer https://leetcode.com/problems/reverse-integer/
*/
impl Solution {
    pub fn reverse(x: i32) -> i32 {
        let mut y = x.clone();
        let mut rev: i32 = 0;
        while y != 0 {
            if let Some(r1) = rev.checked_mul(10) {
                if let Some(r2) = r1.checked_add(y % 10) {
                    rev = r2;
                    y = y / 10;

                    continue;
                }
            }

            return 0;
        }

        rev
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_reverse() {
        assert_eq!(Solution::reverse(123), 321);
        assert_eq!(Solution::reverse(-123), -321);
        assert_eq!(Solution::reverse(120), 21);
        assert_eq!(Solution::reverse(1534236469), 0);
    }
}