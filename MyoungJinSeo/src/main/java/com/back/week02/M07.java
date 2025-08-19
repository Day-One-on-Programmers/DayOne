package com.back.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M07 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
