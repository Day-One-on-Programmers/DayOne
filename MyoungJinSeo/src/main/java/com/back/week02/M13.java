package com.back.week02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;

public class M13 {
    public static void main(String[] args) {
//        int [] priorities = {2,1,3,2};
        int [] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int [] arr = Arrays.stream(priorities)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }
        int cnt = 0;
        while (!queue.isEmpty()){
            int i = queue.poll();
            if (priorities[i] == arr[cnt]){
                cnt++;
                if(i == location)
                    break;
            } else {
                queue.add(i);
            }
        }
        return cnt;
    }
}
