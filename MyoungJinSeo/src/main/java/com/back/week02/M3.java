package com.back.week02;

import java.util.Arrays;

public class M3 {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2};
        System.out.println(solution(arr));
    }

    public static boolean solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = i + 1;
        }
        Arrays.sort(arr);
        return Arrays.equals(arr, answer);
    }
}
