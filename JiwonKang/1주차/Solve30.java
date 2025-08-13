// 생성자 오버로딩 - 실습

public class Solve30 {
    
}

public class Car {
    int speed;
    boolean operable;
    char grade;
    
    Car(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
    
    /**
        1. 매개변수를 받지 않는 생성자를 작성합니다.
        - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
    */
    Car() {
        speed = 10;
        operable = true;
        grade = 'B';
    }
    
    /**
        2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
        - operable은 true, grade는 'B' 값으로 초기화하세요
    */
    Car(int speed) {
        this.speed = speed;
        operable = true;
        grade = 'B';
    }
    
    /**
        3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
        - grade는 'B' 값으로 초기화하세요
    */
    Car(int speed, boolean operable) {
        this.speed = speed;
        this.operable = operable;
        grade = 'B';
    }
    
    
    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(20);
        Car car3 = new Car(20, false);
        Car car4 = new Car(20, true, 'A');
        
        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }
}