package Week1;

public class M12 {
    public int solution(int value) {
        int a = 10;
        int b = 5;
        int result = 0;
        switch(value){
            case 1 :
                result = a + b;
                break;
            case 2 :
                result = a - b;
                break;
            case 3 :
                result = a * b;
                break;
            case 4 :
                result = a / b;
                break;
            default :
                result = a % b;
        }
        // 코드를 작성하세요

        return result;
    }

}
