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

    pub fn reverse_to_string(x: i32) -> i32 {
        if x.checked_abs() == None {
            return 0;
        }

        let signed = if x < 0 {
            "-"
        } else {
            ""
        }.to_string();
        let rev_str: String = x.abs().to_string().chars().rev().collect();

        match (signed + &rev_str).parse::<i32>() {
            Ok(n) => { n }
            _ => 0
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_reverse() {
        assert_eq!(Solution::reverse(123), 321);
        assert_eq!(Solution::reverse_to_string(123), 321);

        assert_eq!(Solution::reverse(-123), -321);
        assert_eq!(Solution::reverse_to_string(-123), -321);

        assert_eq!(Solution::reverse(120), 21);
        assert_eq!(Solution::reverse_to_string(120), 21);

        assert_eq!(Solution::reverse(1534236469), 0);
        assert_eq!(Solution::reverse_to_string(1534236469), 0);
    }
}