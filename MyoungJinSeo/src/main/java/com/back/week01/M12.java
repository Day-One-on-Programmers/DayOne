package com.back.week01;

public class M12 {
    public static void main(String[] args) {
        int value = 1;
        System.out.println(solution(value));
    }
    public static int solution(int value) {
        int a = 10;
        int b = 5;
        int result = 0;

        // 코드를 작성하세요
        switch(value){
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = a / b;
            default -> result = a % b;
        }
        return result;
    }
}
