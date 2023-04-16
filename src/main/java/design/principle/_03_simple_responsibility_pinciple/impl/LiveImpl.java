package design.principle._03_simple_responsibility_pinciple.impl;

import design.principle._03_simple_responsibility_pinciple.*;

public class LiveImpl implements ILive {
    @Override
    public void sleep() {
        System.out.println("我睡觉");
    }

    @Override
    public void eat() {
        System.out.println("我在学校食堂吃饭");
    }

    @Override
    public void study() {
        System.out.println("我上课学习呢");
    }

    @Override
    public void wash() {
        System.out.println("我洗澡");
    }
}
