package org.leocoder.abs_factory.factory;

import org.leocoder.abs_factory.product.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 19:19
 * @description : 具体工厂2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public ProductA createProductA_() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB_() {
        return new ProductB2();
    }
}
