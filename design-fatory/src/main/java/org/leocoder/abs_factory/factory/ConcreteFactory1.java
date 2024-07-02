package org.leocoder.abs_factory.factory;

import org.leocoder.abs_factory.product.ProductA;
import org.leocoder.abs_factory.product.ProductA1;
import org.leocoder.abs_factory.product.ProductB;
import org.leocoder.abs_factory.product.ProductB1;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 19:19
 * @description : 具体工厂1
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public ProductA createProductA_() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB_() {
        return new ProductB1();
    }
}
