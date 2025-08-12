package com.back.week01;

import java.util.stream.IntStream;

public class M25 {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }
    /**
     길이가 100인 배열 array 변수를 선언하고
     for문을 이용해서 array에 1부터 100까지의 자연수를 순서대로 넣어 보세요.
     */
    public static int solution(int index) {
        // 코드를 작성하세요
        int[] array = new int[100];

        IntStream.range(1, 101)
                .forEach(i -> array[i - 1] = i);

        return array[index];
    }
}
