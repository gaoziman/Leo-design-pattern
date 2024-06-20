package org.javatop.principle.isolation;

// 机器人类
public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void eat() {
        // 机器人不需要吃饭，但必须实现这个方法
    }
}
