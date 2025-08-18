package Week2;

import java.util.HashMap;
import java.util.Map;

public class M3_3 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        for(int value : map.values()){
            answer *= (value + 1);
        }

        System.out.println(answer);


        return answer - 1;
    }


}
