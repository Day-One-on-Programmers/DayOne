package Week2;

import java.util.HashMap;
import java.util.Map;

public class M3_1 {


    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);

        }
        answer = map.size();
        if(answer > (nums.length / 2))
            answer = nums.length / 2;
        return answer;
    }

}
