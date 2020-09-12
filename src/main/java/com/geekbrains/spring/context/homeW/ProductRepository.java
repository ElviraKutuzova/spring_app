package com.geekbrains.spring.context.homeW;

import java.util.List;

public interface ProductRepository {

    Product findProductById(Long id);

    void save(Product product);
    void remove(Long id);

    List<Product> findAll();

    String findProductByName(String name);

    int findProductByPrice(int id);

    Long findId(String name);
    int findPrice(String name);
    String findName (String name);
}
