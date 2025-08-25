package com.back.week02;

import java.util.Arrays;

public class M12 {
    public static void main(String[] args) {
        int [] prices = {1,2,3,2,3};
        System.out.println(Arrays.toString(solution(prices)));
    }
    public static int[] solution(int[] prices) {
        int n = prices.length;
        int [] answer = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                answer[i]++;
                if(prices[i] > prices[j]){
                    break;
                }
            }
        }
        return answer;
    }
}
