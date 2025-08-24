package com.back.week01;

public class M25 {
    /**
     길이가 100인 배열 array 변수를 선언하고
     for문을 이용해서 array에 1부터 100까지의 자연수를 순서대로 넣어 보세요.
     */
    int [] array = new int[100];

    public int solution(int index) {
        // 코드를 작성하세요
        for(int i = 1; i <= 100; i++) {
            array[i-1] = i;
        }
        return array[index];
    }
}
