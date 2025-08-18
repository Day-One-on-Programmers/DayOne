package Week1;

public class M13 {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;

        // 0부터 10까지 중 홀수들의 합을 구하세요.
        while(i <= 10){
            if(i % 2 == 1)
                result += i;
            i++;
        }

        System.out.println(result);
    }

}
