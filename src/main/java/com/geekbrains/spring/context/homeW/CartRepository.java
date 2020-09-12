package com.geekbrains.spring.context.homeW;

public interface CartRepository {
    void save(Long id, String nameProduct);

    void find(Long id);
}
