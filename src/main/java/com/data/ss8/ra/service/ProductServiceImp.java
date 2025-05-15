package com.data.ss8.ra.service;

import com.data.ss8.ra.model.Product;
import com.data.ss8.ra.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public boolean saveProduct(Product product) {
        return productRepo.add(product);
    }

    @Override
    public boolean update(Product product) {
        return productRepo.update(product);
    }

    @Override
    public boolean delete(int id) {
        return productRepo.delete(id);
    }
}
