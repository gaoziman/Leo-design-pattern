package org.javatop.principle.replacement.strong;

interface Flyable {
    void fly();
}

class Bird {
    public void eat() {
        System.out.println("I can eat");
    }
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}

class Penguin extends Bird {
    // 企鹅没有实现Flyable这个接口

    public static void letBirdFly(Flyable bird) {
        bird.fly();
    }
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        letBirdFly(sparrow); // This works
        // letBirdFly(penguin); // 这将导致编译时错误
    }
}


