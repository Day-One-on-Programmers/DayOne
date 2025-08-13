// 단항 연산자 - 실습

public class Solve07 {
    public static void main(String[] args) {
        int x = 10;

        // x의 음수 연산
        x = -x;

        // x의 양수 연산
        x = +x;

        // x의 증가 연산
        x++;

        // x의 감소 연산
        x--;

        boolean isTrue = x == 11;
        
        // isTrue의 논리 부정 연산
        isTrue = !isTrue;

        System.out.println(isTrue);
    }
}
