package Week1;

public class M38 {
}
/*
    1. Car 추상 클래스를 상속받고, 추상 메소드를 구현하세요.
        - turnOn 메소드에서는 "제네시스 시동을 켰습니다." 문자열을 출력합니다.
        - turnOff 메소드에서는 "제네시스 시동을 껐습니다." 문자열을 출력합니다.
*/
class GenesisCar5 extends Car17{

    @Override
    void turnOn() {
        System.out.println("제네시스 시동을 켰습니다.");
    }

    @Override
    void turnOff() {
        System.out.println("제네시스 시동을 껐습니다.");
    }

    public static void main(String[] args) {
        //아래는 실행을 위한 코드입니다. 수정하지 마세요.
        GenesisCar5 genesisCar = new GenesisCar5();
        genesisCar.turnOn();
        genesisCar.turnOff();
    }
}

abstract class Car17 {
    /*
        2. 추상 메소드를 선언하세요.
            - 메소드명 : turnOn, turnOff
            - (둘다 결과를 반환하지 않습니다)
    */
    abstract void turnOn();
    abstract void turnOff();

}