package com.geekbrains.spring.context.homeW;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryCartRepository implements CartRepository{


    Map<Long, String> carts = new HashMap<Long, String>();

    public void save(Long idUser, String product) {
        carts.put(idUser, product);
    }

    public void find(Long idUser) {
        String f = carts.get(idUser);
        System.out.println(f);
    }


}
