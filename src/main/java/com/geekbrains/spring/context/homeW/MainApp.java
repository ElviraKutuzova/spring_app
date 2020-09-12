package com.geekbrains.spring.context.homeW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            ProductService productService = context.getBean("productService", ProductService.class);
            CartService cartService = context.getBean("cartService", CartService.class);
            UserService userService = context.getBean("userService", UserService.class);


//        Пополняем список продуктов
        productService.addProduct( new Product(6L, "Water", 15));
        System.out.println(productService.findAll());

//        Удаляем продукт из каталога продуктов
        productService.removeProduct(2L);
        System.out.println(productService.findAll());

//        Добавляем вновь зарегистрированных покупателей в список
        userService.addUser( new User(6L, "Gleb"));
        System.out.println(userService.findAll());


        context.close();
    }
}
