package com.back.week01;

public class M46 {
    public int[] solution(int[][] array) {
        int[] answer = new int[array.length]; // 행 개수만큼 크기 설정

        for (int i = 0; i < array.length; i++) {
            int max = array[i][0]; // 첫 번째 원소로 초기화
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            answer[i] = max;
        }

        return answer;
    }
}
