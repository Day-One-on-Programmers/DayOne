package com.back.week01;

public class M37 {
    public class Practice {
        public static void main(String[] args) {
            Car7 car = new Car7(150, true, 'B');

            System.out.println(car.speed);
            System.out.println(car.operable);
            System.out.println(car.grade);
            car.run();
        }
    }

}

class Car7 {
    int speed;
    boolean operable;
    char grade;

    Car7(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    public void run() {
        System.out.println("차가 달립니다.");
    }
}
