package com.data.ss8.ra.repository;

import com.data.ss8.ra.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    boolean add(Product product);
    boolean update(Product product);
    boolean delete(int id);
}
