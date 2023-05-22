package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "tarot_name")
    private String productName;

    @Column(name = "url")
    private String url;

    public Product () {}

    public Product(String productName, String url) {
        this.productName = productName;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarotName() {
        return productName;
    }

    public void setTarotName(String productName) {
        this.productName = productName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
