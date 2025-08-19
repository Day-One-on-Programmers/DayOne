package com.back.week02;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class M08 {
    public static void main(String[] args) {
        int [] arr = {4,7,32,43,22,19};
        System.out.println(solution(arr));
    }

    public static boolean solution(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).filter(i -> i <= 45 || i >= 1).boxed().collect(Collectors.toSet());
        return set.size() == arr.length;
    }
}
