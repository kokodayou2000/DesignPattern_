package design.principle._03_simple_responsibility_pinciple.impl;

import design.principle._03_simple_responsibility_pinciple.*;


public class WorkImpl implements IWork {

    @Override
    public void eat() {
        System.out.println("工作的时候吃东西");
    }

    @Override
    public void goof() {
        System.out.println("工作的时候摸鱼");
    }

    @Override
    public void overtime() {
        System.out.println("摸鱼太多要加班才能完成工作了");
    }
}
