package Week2;

import java.util.ArrayList;
import java.util.List;

public class M4_3 {

    public int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        int index = 0;
        list.add(arr[0]);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1])
                list.add(arr[i + 1]);
        }
        int answer[] = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();





        return answer;
    }
}
