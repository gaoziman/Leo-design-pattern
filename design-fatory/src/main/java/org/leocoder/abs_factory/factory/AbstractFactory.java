package org.leocoder.abs_factory.factory;

import org.leocoder.abs_factory.product.ProductA;
import org.leocoder.abs_factory.product.ProductB;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 19:17
 * @description : 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract ProductA createProductA_();
    public abstract ProductB createProductB_();
}
