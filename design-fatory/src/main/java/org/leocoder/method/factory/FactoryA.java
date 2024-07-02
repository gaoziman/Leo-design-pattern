package org.leocoder.method.factory;

import org.leocoder.method.product.Product;
import org.leocoder.method.product.ProductA;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 11:38
 * @description : FactoryA
 */
public class FactoryA extends Factory_ {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
