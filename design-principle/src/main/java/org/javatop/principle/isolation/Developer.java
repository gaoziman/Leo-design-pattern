package org.javatop.principle.isolation;

// 开发者类
public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is working.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}
