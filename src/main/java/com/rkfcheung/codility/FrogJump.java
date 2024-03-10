package com.rkfcheung.codility;

/*
Frog Jump https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
*/
public class FrogJump {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        if (X == Y) {
            return 0;
        }

        int r = (Y - X) % D;

        return ((Y - X) / D) + (r > 0 ? 1 : 0);
    }
}
