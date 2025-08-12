package com.back.week01;

public class M39 extends Car9 {
    int price;

    M39(int speed, boolean operable, char grade, int price) {
        super(speed, operable, grade);

        this.price = price;
    }

    @Override
    public void turnOn() {
        System.out.println("제네시스 시동을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("제네시스 시동을 껐습니다.");
    }

    public static void main(String[] args) {
        /**
         1. GenesisCar인스턴스를 생성하고, Car클래스로 자동 타입 변환 선언합니다.
         - GenesisCar 인스턴스 생성 시, 인자를 아래와 같이 대입해주세요.
         - speed : 300
         - operable : true
         - grade : 'A'
         - price : 8000
         */

        // 2. 자동 타입 변환한 인스턴스에서 turnOn메소드를 호출합니다.

        // 3. 자동 타입 변환한 인스턴스에서 turnOff메소드를 호출합니다.

        // 4. 자동 타입 변환한 인스턴스에서 speed필드를 출력합니다. (System.out.println 활용)

        // 5. car 인스턴스를 GenesisCar클래스로 강제 타입 변환합니다.

        // 6. 강제 타입 변환한 인스턴스에서 price필드를 출력합니다. (System.out.println 활용)
        Car9 genesisCar = new M39(300, true, 'A', 8000);
        genesisCar.turnOn();
        genesisCar.turnOff();
        System.out.println(genesisCar.speed);
        M39 car = (M39) genesisCar;
        System.out.println(car.price);
    }
}


abstract class Car9 {
    public int speed;
    public boolean operable;
    public char grade;

    Car9(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}
