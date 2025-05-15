package com.data.ss8.ra.controller;

import com.data.ss8.ra.model.Product;
import com.data.ss8.ra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("product")
    public String findAll(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product";
    }

    @GetMapping("addProduct")
    public String add() {
        return "addProduct";
    }

    @GetMapping("product/{id}")
    public String findById(Model model, @PathVariable int id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "ProductDetail";
    }

    @PostMapping("saveProduct")
    public String save(@RequestParam String name,
                       @RequestParam double price,
                       @RequestParam String des) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(des);
        boolean result = productService.saveProduct(product);
        if (result) {
            return "product";
        }else{
            return "redirect:/product";
        }
    }
}