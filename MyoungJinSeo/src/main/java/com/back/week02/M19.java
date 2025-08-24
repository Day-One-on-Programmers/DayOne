package com.back.week02;

public class M19 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i == 0){
                sb.append(s.substring(0,1).toUpperCase());
                continue;
            }
            String s1 = s.substring(i-1,i);
            String s2 = s.substring(i,i+1);
            if(s1.equals(" ")){
                sb.append(s2.toUpperCase());
                continue;
            }
            sb.append(s2);
        }
        return sb.toString();
    }
}
