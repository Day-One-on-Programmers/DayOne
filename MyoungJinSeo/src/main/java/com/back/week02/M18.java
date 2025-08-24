package com.back.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M18 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        return list.stream()
                .sorted()
                .map(i -> i.substring(1))
                .toArray(String[]::new);
    }
}
