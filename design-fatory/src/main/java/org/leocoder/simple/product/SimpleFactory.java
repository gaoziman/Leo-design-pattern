package org.leocoder.simple.product;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 13:53
 * @description : 简单工厂类
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        else if (type.equals("C")) {
            // return new ConcreteProductC();
        }
        return null;
    }
}
