package com.geekbrains.spring.context.homeW;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Long id;
    private String nameProduct;

    public Cart(Long id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
