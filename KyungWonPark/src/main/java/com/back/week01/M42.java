package com.back.week01;

public class M42 {

    public static void test(TV tv) {
        tv.on();
        tv.off();
    }

    public static void main(String[] args) {
        /**
         1. SmartTV 인스턴스를 생성해서 TV 타입 변수 tv1에 대입합니다.
         2. test메소드를 호출합니다. 인자로 tv1 변수를 넣어보세요.
         */
        TV tv1 = new SmartTV();
        test(tv1);

        /**
         3. LedTV 인스턴스를 생성해서 TV 타입 변수 tv2에 대입합니다.
         4. test메소드를 호출합니다. 인자로 tv2 변수를 넣어보세요.
         */
        TV tv2 = new LedTV();
        test(tv2);
    }
}

interface TV {
    public static final String UNIT = "inch";
    public abstract void on();
    public abstract void off();
}

class LedTV implements TV {
    @Override
    public void on() {
        System.out.println("LED TV를 켜다");
    }
    @Override
    public void off() {
        System.out.println("LED TV를 끄다");
    }
}

class SmartTV implements TV {
    @Override
    public void on() {
        System.out.println("스마트TV를 켜다");
    }
    @Override
    public void off() {
        System.out.println("스마트TV를 끄다");
    }
}