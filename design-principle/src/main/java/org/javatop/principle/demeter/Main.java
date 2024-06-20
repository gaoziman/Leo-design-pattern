package org.javatop.principle.demeter;

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

    public Oil getOil() {
        return oil;
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // 违反迪米特法则的代码：直接访问内部对象的内部对象的方法
        car.getEngine().getOil().checkOilLevel();
    }
}
