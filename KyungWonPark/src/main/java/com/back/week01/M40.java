package com.back.week01;

public class M40 {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.on();
        tv.off();
        System.out.println(TV.UNIT);
    }
}


// LedTV클래스는 결과 평가를 위한 코드입니다. 수정하지 마세요.
class LedTV implements TV{
    @Override
    public void on(){
        System.out.println("켜다");
    }
    @Override
    public void off(){
        System.out.println("끄다");
    }
}

interface TV {
    // 상수
    public static final String UNIT = "inch";

    // 추상 메소드
    public abstract void on();
    public abstract void off();
}