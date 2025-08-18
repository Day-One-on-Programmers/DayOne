package Week2;

import java.util.HashMap;
import java.util.Map;

public class M3_2 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);      //<사람이름, 사람수> 로 구분
        }                                                                          //map에는 <참가자이름, 인원>으로 입력

        for(int i = 0; i < completion.length; i++){
            map.put(completion[i], map.get(completion[i]) - 1);                    //map에 완주자가 있으면, 인원을 1만큼 감소
        }
        for(int i = 0; i < participant.length; i++){
            if(map.get(participant[i]) == 1){                                      //만약 동명이인이면 한명이 완주해도 한명은 완주x
                answer = participant[i];
                break;
            }
        }



        return answer;
    }


}
