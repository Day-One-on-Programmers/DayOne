package com.back.week01;

public class M17 {
    public static void main(String[] args) {
        // Car클래스로부터 객체를 생성해 car 변수명으로 저장하세요.
        Car2 car = new Car2();

        System.out.println(car.isCar());
    }
}
class Car2{
    public boolean isCar() {
        return true;
    }

}
