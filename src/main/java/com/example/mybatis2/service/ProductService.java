package com.example.mybatis2.service;

import com.example.mybatis2.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    int deleteBydId(int id);
    int save(Product item);
    int update(int id, Product item);
}
