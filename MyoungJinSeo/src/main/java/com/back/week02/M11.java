package com.back.week02;

import java.util.*;

public class M11 {
    public static void main(String[] args) {
        int [] arr = {93, 30, 55};
        int [] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(arr, speeds)));

    }
    public static int[] solution(int[] progresses,int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int a = (100-progresses[i]) /speeds[i];
            if((100-progresses[i]) % speeds[i] == 0)
                queue.add(a);
            else
                queue.add(a + 1);
        }
        int cnt = 1;
        int b = queue.poll();
        while (!queue.isEmpty()) {
            if(b >= queue.peek()){
                queue.poll();
                cnt++;
            } else {
                b = queue.poll();
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
