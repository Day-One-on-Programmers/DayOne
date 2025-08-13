package com.back.week01;

import java.util.Arrays;

public class M46 {
    public static void main(String[] args) {
        int[][] arr = {{1, 8, 5},{2, 11, 5},{3, 2, 1}};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for(int j : arr[i]) {
                if(j > max)
                    max = j;
            }
            result[i] = max;
        }
        return result;
    }
}
