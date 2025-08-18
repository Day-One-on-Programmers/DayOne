package Week2;


class M2_3 {
    public int[] solution(long n) {
        int k = String.valueOf(n).length();
        int arr[] = new int[k];
        String str = String.valueOf(n);
        for(int i = 0; i < k; i++){
            arr[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        int index = 0;
        int answer[] = new int[k];
        for(int i = k - 1; i >= 0; i--){
            answer[index] = arr[i];
            index++;
        }
        return answer;
    }
}