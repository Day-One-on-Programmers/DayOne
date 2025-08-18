package com.back.week02;

import java.util.HashMap;
import java.util.Map;

public class M4 {
    public static void main(String[] args) {
        int [] arr = {3,1,2,3};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        int n = arr.length / 2;
        int a = map.size();
        return Math.min(a,n);
    }
}
