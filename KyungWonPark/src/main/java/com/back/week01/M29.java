package com.back.week01;

public class M29 {

    void run() {
    }

    // 1. 정수 타입 매개변수 하나를 받는 메소드 run을 추가해보세요.
    void run(int i) {

    }

    // 2. 정수 타입, boolean타입 매개변수 두개를 받는 메소드 run을 추가해보세요.
    void run(int a, boolean b) {

    }

    // 3. String클래스 타입 매개변수 하나를 받고,
    //    결과값으로 boolean타입 false를 반환하는 메소드 run을 추가해보세요.
    boolean run(String str) {
        return false;
    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        M29 car = new M29();
        car.run(10);
        car.run(10, true);
        boolean result = car.run("테스트");

        System.out.println(result);
    }
}