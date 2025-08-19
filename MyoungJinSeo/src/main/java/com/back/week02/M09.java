package com.back.week02;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class M09 {
    public static void main(String[] args) {
        String[] strArr = {"tank","kick","wheel","land","dream","mother","robot","tank"};
        System.out.println(solution(strArr));;
    }

    public static boolean solution(String[] arr) {
        Set<String> set = Arrays.stream(arr).collect(Collectors.toSet());
        if(set.size() != arr.length)
            return false;
        char last = arr[0].charAt(arr[0].length() - 1);
        for (int i = 1; i < arr.length; i++) {
            char first = arr[i].charAt(0);
            if(last != first)
                return false;
            last = arr[i].charAt(arr[i].length() - 1);
        }
        return true;
    }
}
