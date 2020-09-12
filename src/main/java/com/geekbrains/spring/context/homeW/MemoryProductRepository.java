package com.geekbrains.spring.context.homeW;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class MemoryProductRepository implements ProductRepository{
    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Apple", 74),
                new Product(2L, "Orange", 56),
                new Product(3L, "Pear", 47),
                new Product(4L, "Watermelon", 63),
                new Product(5L, "Pineapple", 95)

        ));
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }


    public Product findProductById(Long id){
       for (Product i : products){
           if(i.getId().equals(id)){
               return i;
           }
       }
       throw new RuntimeException("Product not found");
    }

    public String findProductByName(String name){
        for (Product i : products){
            if(i.getName().equals(name)){
                return i.getName();
            }
        }
        throw new RuntimeException("Product not found");
    }

    public int findProductByPrice(int id){
        for (Product i : products){
            if(i.getId().equals(id)){
                return i.getPrice();
            }
        }
        throw new RuntimeException("Product not found");
    }


    public String findName(String name){
        for (Product i : products){
            if(i.getName().equals(name)){
                return i.getName();
            }
        }
        throw new RuntimeException("Product not found");
    }

    public Long findId(String name){
        for (Product i : products){
            if(i.getName().equals(name)){
                return i.getId();
            }
        }
        throw new RuntimeException("Product not found");
    }

    public int findPrice(String name){
        for (Product i : products){
            if(i.getName().equals(name)){
                return i.getPrice();
            }
        }
        throw new RuntimeException("Product not found");
    }

    public void save(Product product) {
        products.add(product);
    }

    public void remove(Long id) {
        products.remove(findProductById(id));
    }
}
