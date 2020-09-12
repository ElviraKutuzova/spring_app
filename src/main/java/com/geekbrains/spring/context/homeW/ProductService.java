package com.geekbrains.spring.context.homeW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setMemoryProductRepository(MemoryProductRepository memoryProductRepository) {
        this.productRepository = memoryProductRepository;
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }
    public void removeProduct(Long id) {
//        productRepository.findProductById(id);
        productRepository.remove(id);
    }
    public Long findId(String name){
        return productRepository.findId(name);
    }

    public int findPrice(String name){
        return productRepository.findPrice(name);
    }


}
