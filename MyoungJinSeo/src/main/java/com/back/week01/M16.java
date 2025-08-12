package com.back.week01;

public class M16 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.isCar());
    }
}

/**
 * 빈 칸을 채워 클래스를 선언해보세요.
 * 클래스명은 Car 입니다.
 */
class Car {
    public boolean isCar() {
        return true;
    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.isCar());
    }
}
