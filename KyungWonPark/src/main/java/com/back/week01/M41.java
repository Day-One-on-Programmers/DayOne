package com.back.week01;

public class M41 {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.on();
        tv.off();
    }
}


interface TV {
    public static final String UNIT = "inch";
    public abstract void on();
    public abstract void off();
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

/**
 TV인터페이스를 구현하는 SmartTV클래스를 작성하세요.
 - on 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 켜다" 문자열을 출력합니다
 - off 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 끄다" 문자열을 출력합니다
 */
