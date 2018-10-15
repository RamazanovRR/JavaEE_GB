package ru.Ramazanov.enterprise.servlet.product;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ProductBase {
    private static ProductBase instance;

    @Getter
    @Setter
    private ArrayList<Product> listProduct;

    private ProductBase() {
        listProduct = new ArrayList<Product>();
        for(int i = 1; i < 11; i++) {
            String tmp = "Товар " + i;
            listProduct.add(new Product(tmp, 150 * i));
        }
    }

    public static ProductBase getInstance() {
        if(instance == null) {
            instance = new ProductBase();
        }
        return instance;
    }
    
}
