package com.back.week02;

import java.util.Arrays;

public class M20 {
    public static void main(String[] args) {
        int [] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int candidate = n - i;
            if (citations[i] >= candidate) {
                return candidate;
            }
        }

        return 0;
    }
}
