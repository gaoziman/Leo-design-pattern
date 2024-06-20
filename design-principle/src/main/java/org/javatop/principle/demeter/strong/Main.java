package org.javatop.principle.demeter.strong;

class Oil {
    public void checkOilLevel() {
        System.out.println("Checking oil level");
    }
}

class Engine {
    private Oil oil;

    public Engine() {
        this.oil = new Oil();
    }

    public void checkOilLevel() {
        oil.checkOilLevel();
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void checkOilLevel() {
        engine.checkOilLevel();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // 遵循迪米特法则的代码：只调用直接对象的方法
        car.checkOilLevel();
    }
}
