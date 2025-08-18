// String 클래스 사용하기 - 실습

public class Solve23 {
    /**
        String클래스의 equals 메소드를 사용해서, 문자열을 비교하는 메소드를 완성해보세요.
        - 비교한 결과는 result변수에 저장합니다.
        - 단, a 매개변수에는  null이 전달될 수 있습니다
    */
    public static boolean isEquals(String a, String b) {
        boolean result = b.equals(a);

        return result;
    }

    public static void main(String[]args){
        // 검증을 위한 코드이니 수정하지 마세요.
        System.out.println(isEquals("Hello", "Hello"));
        System.out.println(isEquals("Hello", "World"));
        System.out.println(isEquals(null, "test"));
    }
}
