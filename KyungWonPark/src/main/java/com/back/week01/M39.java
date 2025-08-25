package com.back.week01;

public class GenesisCar extends Car {
    int price;

    GenesisCar(int speed, boolean operable, char grade, int price) {
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
        // 1. GenesisCar 인스턴스를 생성하고 Car로 자동 타입 변환
        Car car = new GenesisCar(300, true, 'A', 8000);

        // 2. turnOn 메소드 호출
        car.turnOn();

        // 3. turnOff 메소드 호출
        car.turnOff();

        // 4. speed 필드 출력
        System.out.println(car.speed);

        // 5. car 인스턴스를 GenesisCar로 강제 타입 변환
        GenesisCar gCar = (GenesisCar) car;

        // 6. price 필드 출력
        System.out.println(gCar.price);
    }
}

abstract class Car {
    public int speed;
    public boolean operable;
    public char grade;

    Car(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
