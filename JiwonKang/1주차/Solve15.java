// 반복문의 break, continue - 실습

public class Solve15 {
    /**
        break문과 continue문을 활용하여 코드를 추가 작성하세요.
    */
    public static void main(String[] args) {
        int result = 0;
        
        for (int i=1; i<=30; i++) {
            if(i == 15) {continue;}
            
            if(i == 20) {break;}
            
            if(i % 3 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
