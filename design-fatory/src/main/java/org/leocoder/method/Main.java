package org.leocoder.method;

import org.leocoder.method.factory.FactoryA;
import org.leocoder.method.factory.FactoryB;
import org.leocoder.method.factory.Factory_;
import org.leocoder.method.product.Product;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 11:39
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        // 创建工厂A和产品A
        Factory_ factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.use(); // 输出：使用产品A

        //
        Factory_ factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.use(); // 输出：使用产品B
    }
}

