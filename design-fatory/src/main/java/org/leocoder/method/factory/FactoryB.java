package org.leocoder.method.factory;

import org.leocoder.method.product.Product;
import org.leocoder.method.product.ProductB;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 11:38
 * @description : FactoryB
 */
public class FactoryB extends Factory_ {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
