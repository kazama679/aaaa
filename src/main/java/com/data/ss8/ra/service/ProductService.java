package com.data.ss8.ra.service;
import com.data.ss8.ra.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    boolean saveProduct(Product product);
}
