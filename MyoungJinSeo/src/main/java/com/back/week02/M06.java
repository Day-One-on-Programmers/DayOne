package com.back.week02;

import java.util.HashMap;
import java.util.Map;

public class M06 {
    public static void main(String[] args) {
        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(arr));
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] strings : clothes) {
            map.put(strings[1], map.getOrDefault(strings[1], 0) + 1);
        }
        int answer = 1;
        for (Integer integer : map.values()) {
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
