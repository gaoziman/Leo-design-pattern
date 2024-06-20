package org.javatop.principle.isolation.strong;

// 开发者类实现了工作和吃饭接口
public class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer is working.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}
