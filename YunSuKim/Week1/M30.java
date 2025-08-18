package Week1;

public class M30 {
}

class Car9 {
    int speed;
    boolean operable;
    char grade;

    Car9(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    /**
     1. 매개변수를 받지 않는 생성자를 작성합니다.
     - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Car9(){
        speed = 10;
        operable = true;
        grade = 'B';
    }
    /**
     2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
     - operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Car9(int spped){
        this.speed = speed;
        operable = true;
        grade = 'B';
    }

    /**
     3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
     - grade는 'B' 값으로 초기화하세요
     */
    Car9(int speed, boolean operable){
        this.speed = speed;
        this.operable = operable;
        grade = 'B';
    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car9 car1 = new Car9();
        Car9 car2 = new Car9(20);
        Car9 car3 = new Car9(20, false);
        Car9 car4 = new Car9(20, true, 'A');

        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }
}
