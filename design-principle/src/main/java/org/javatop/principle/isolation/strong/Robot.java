package org.javatop.principle.isolation.strong;

// 机器人类只实现了工作接口
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
