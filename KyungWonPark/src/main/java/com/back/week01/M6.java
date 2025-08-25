package com.back.week01;

//문제 설명
//float 타입 변수 floatValue의 값을 int 타입 변수로 넣으려 합니다.
//빈칸에 int타입 변수 intValue를 선언하고 floatValue를 이용해 초기화해보세요.


public class M6 {
    public static void main(String[] args) {
        int x = 10;
        // x의 음수 연산
        x = -x;
        // x의 양수 연산
        x = +x;
        // x의 증가 연산
        x++;
        // x의 감소 연산
        x--;
        boolean isTrue = x == 11;
        // isTrue의 논리 부정 연산
        isTrue = !isTrue;
        System.out.println(isTrue);
    }
}
