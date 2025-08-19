package com.back.week02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class M02 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,5,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max)
                .toArray();
    }
}
