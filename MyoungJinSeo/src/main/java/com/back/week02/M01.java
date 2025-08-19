package com.back.week02;

import java.util.Arrays;

public class M01 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
