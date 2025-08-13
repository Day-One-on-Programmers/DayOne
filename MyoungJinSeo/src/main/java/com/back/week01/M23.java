package com.back.week01;

public class M23 {
    public static boolean isEquals(String a, String b) {
        boolean result = b.equals(a);
        return result;
    }

    public static void main(String[]args){
        // 검증을 위한 코드이니 수정하지 마세요.
        System.out.println(isEquals("Hello", "Hello"));
        System.out.println(isEquals("Hello", "World"));
        System.out.println(isEquals(null, "test"));
    }
}
