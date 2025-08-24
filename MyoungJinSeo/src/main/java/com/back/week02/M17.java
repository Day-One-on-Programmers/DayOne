package com.back.week02;

import java.util.Arrays;

public class M17 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        return arr.length > 1 ? Arrays.stream(arr)
                .filter(i -> i != min)
                .toArray() : new int[]{-1};
    }
}
