package com.rkfcheung.codility;

/*
Count Div https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }
}
