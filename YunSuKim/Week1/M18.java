package Week1;

public class M18 {

}

 class Practice {
    public static boolean methodA(int a){
        return true;
    }
    /**
     1. 매개변수가 있고 결과값을 반환하는 메소드를 선언하세요.
     - 메소드명 : methodA
     - 매개변수 : 정수 값을 받고, 변수명은 a
     - 결과값 반환 : boolean타입 값 true를 반환
     */

    public static void methodB(int a){

    }
    /**
     2. 매개변수가 있는 메소드를 선언하세요. (결과값은 반환하지 않습니다)
     - 메소드명 : methodB
     - 매개변수 : 정수 값을 받고, 변수명은 a
     */
    public static void methodC(){

    }

    /**
     3. 매개변수가 없는 메소드를 선언하세요. (결과값은 반환하지 않습니다)
     - 메소드명 : methodC
     */


    public static void main(String[] args) {
        Practice10 practice = new Practice10();
        System.out.println(practice.methodA(10));
        practice.methodB(10);
        practice.methodC();
    }
}