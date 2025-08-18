package com.back.week02;

import java.util.HashMap;
import java.util.Map;

public class M5 {
    public static void main(String[] args) {
        String[] strArr = {"leo", "kiki", "eden"};
        String[] strArr1 = {"kiki", "eden"};
        System.out.println(solution(strArr,strArr1));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : participant) {
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        for (String str : completion) {
            int n = map.get(str) - 1;
            if(n == 0)
                map.remove(str);
            else
                map.put(str,n);
        }
        return map.keySet().iterator().next();
    }
}
