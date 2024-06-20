package org.javatop.principle.replacement;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-20 16:04
 * @description : 违反了里氏替换原则
 */
class Bird {
    public void fly() {
        System.out.println("I can fly");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}

