package com.example.demo.controller;

import com.example.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ProductServiceImpl;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/products/random")
    public List<Product> getRandomCards() {
        try{
            int count = 3; // 랜덤하게 뽑을 카드 개수
            return productService.getRandomCards(count);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createCards(@RequestBody Product product) {
        try{
            ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(productService.save(product));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateCards(
            @PathVariable("id") long id,
            @RequestBody Product product
    ) {
        try{
            ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(productService.update(id, product));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteCards(@PathVariable("id") long id) {
        try{
            productService.delete(id);
            ResponseEntity.noContent();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
