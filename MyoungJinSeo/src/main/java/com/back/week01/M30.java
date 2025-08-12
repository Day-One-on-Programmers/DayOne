package com.back.week01;

public class M30 {
    int speed;
    boolean operable;
    char grade;

    M30(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    /**
     * 1. 매개변수를 받지 않는 생성자를 작성합니다.
     * - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
     */
    M30() {
        this.speed = 10;
        this.operable = true;
        this.grade = 'B';
    }

    /**
     * 2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
     * - operable은 true, grade는 'B' 값으로 초기화하세요
     */
    M30(int speed) {
        this.speed = speed;
        this.operable = true;
        this.grade = 'B';
    }

    /**
     * 3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
     * - grade는 'B' 값으로 초기화하세요
     */
    M30(int speed, boolean operable) {
        this.speed = speed;
        this.operable = operable;
        this.grade = 'B';
    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        M30 car1 = new M30();
        M30 car2 = new M30(20);
        M30 car3 = new M30(20, false);
        M30 car4 = new M30(20, true, 'A');

        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }
}

