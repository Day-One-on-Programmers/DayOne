package Week1;

public class M37 {
}

class Practice7 {
    public static void main(String[] args) {
        Car16 car = new Car16(150, true, 'B');

        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
        car.run();
    }
}

class Car16 {
    int speed = 150;
    boolean operable = true;
    char grade = 'B';

    Car16(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    public void run() {
        System.out.println("차가 달립니다.");
    }
}