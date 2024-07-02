package org.leocoder.simple;

import org.leocoder.simple.product.Product;
import org.leocoder.simple.product.SimpleFactory;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-27 13:49
 * @description :
 */
public class Main {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.use();
    }
}
