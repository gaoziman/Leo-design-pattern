package org.leocoder.abs_factory;

import org.leocoder.abs_factory.factory.AbstractFactory;
import org.leocoder.abs_factory.factory.ConcreteFactory1;
import org.leocoder.abs_factory.factory.ConcreteFactory2;
import org.leocoder.abs_factory.product.ProductA;
import org.leocoder.abs_factory.product.ProductB;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 15:54
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        // 使用具体工厂1创建产品
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA_();
        ProductB productB1 = factory1.createProductB_();
        productA1.use(); // 输出：使用产品A1
        productB1.consume(); // 输出：消费产品B1

        // 使用具体工厂2创建产品
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA_();
        ProductB productB2 = factory2.createProductB_();
        productA2.use(); // 输出：使用产品A2
        productB2.consume(); // 输出：消费产品B2
    }
}
