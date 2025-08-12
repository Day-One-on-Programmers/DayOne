package com.back.week01;

public class M34 extends Car4{

        public static void main(String[] args) {
            // GenesisCar 클래스로부터 인스턴스를 생성해서 변수로 선언합니다.
            M34 car = new M34();

            // 상속받은 부모클래스의 turnOn메소드를 호출합니다.

            car.turnOn();
        }

}

class Car4 {
    void turnOn() {
        System.out.println("엔진을 켰습니다");
    }

    void turnOff() {
        System.out.println("엔진을 껐습니다");
    }
}
