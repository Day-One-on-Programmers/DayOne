// 상속 - 실습

public class Solve34 {
    
}

public class GenesisCar 
extends Car
 {
    public static void main(String[] args) {
        // GenesisCar 클래스로부터 인스턴스를 생성해서 변수로 선언합니다.
        GenesisCar gC = new GenesisCar();


        // 상속받은 부모클래스의 turnOn메소드를 호출합니다.
        gC.turnOn();

    }
}

class Car {
    void turnOn() {
        System.out.println("엔진을 켰습니다");    
    }

    void turnOff() {
        System.out.println("엔진을 껐습니다");    
    }
}