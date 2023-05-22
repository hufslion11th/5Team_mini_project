package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProductRepository;
import com.example.demo.domain.Product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getRandomCards(int count) {
        List<Product> allCards = productRepository.findAll();
        Collections.shuffle(allCards);
        return allCards.subList(0, count);
    }

    public Product save(Product product){
        try{
            return productRepository.save(
                    new Product(
                            product.getTarotName(),
                            product.getUrl()
                    )
            );
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Product> findById(Long id) {
        try {
            Optional<Product> productData = productRepository.findById(id);
            if(productData.isPresent()){
                return productData;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Product update(Long id, Product product) {
        try{
            Optional<Product> productData = productRepository.findById(id);
            if(productData.isPresent()){
                Product _product = productData.get();
                _product.setTarotName(product.getTarotName());
                _product.setUrl(product.getUrl());
                productRepository.save(_product);
                return _product;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void delete(Long id) {
        try{
            productRepository.deleteById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
