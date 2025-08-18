package Week1;

public class M46 {
}

class Solution6 {
    public int[] solution(int[][] array) {
        int[] answer = new int[array.length];

        for(int i = 0; i < array.length; i++){
            int max = 0;
            for(int j = 0; j < array[0].length; j++){
                if(max < array[i][j])
                    max = array[i][j];
            }
            answer[i] = max;
        }

        return answer;
    }

}
