// 연습 문제 - 실습

import java.util.Arrays;
import java.util.Collections;

public class Solve46 {
    public int[] solution(int[][] array) {
        int[] answer = new int[array.length];
        
        for(int i=0; i<array.length; i++) {
            int[] descArr = Arrays.stream(array[i])   
                            .boxed()
                            .sorted(Collections.reverseOrder()) 
                            .mapToInt(Integer::intValue)
                            .toArray(); 
            answer[i] = descArr[0];
        }
        
        return answer;
    }
}
