package com.geekbrains.spring.context.homeW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartService {
    private CartRepository cartRepository;
    private UserService userService;

    @Autowired
    public void setMemoryCartRepository(MemoryCartRepository memoryCartRepository) {
        this.cartRepository = memoryCartRepository;
    }


    public void addProduct(Long id, String nameProduct) {
        cartRepository.save(id,nameProduct);
    }

    public void findCart(Long id){
        cartRepository.find(id);
    }

}
