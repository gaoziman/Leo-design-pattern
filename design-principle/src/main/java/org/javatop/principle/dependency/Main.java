package org.javatop.principle.dependency;

// 开关接口
interface Switchable {
    void turnOn();
    void turnOff();
}

// 灯类实现开关接口
class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}

// 开关类依赖于开关接口，而不是具体的实现
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String command) {
        if (command.equalsIgnoreCase("ON")) {
            device.turnOn();
        } else if (command.equalsIgnoreCase("OFF")) {
            device.turnOff();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switch lightSwitch = new Switch(light);
        lightSwitch.operate("ON");
        lightSwitch.operate("OFF");
    }
}
