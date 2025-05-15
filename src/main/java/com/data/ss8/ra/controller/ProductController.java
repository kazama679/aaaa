package com.data.ss8.ra.controller;

import com.data.ss8.ra.model.Product;
import com.data.ss8.ra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("product-delete/{id}")
    public String delete(@PathVariable int id) {
        boolean delete = productService.delete(id);
        if (delete) {
            return "redirect:/product";
        }else{
            return "error";
        }
    }

    @GetMapping("product-update/{id}")
    public String update(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "productEdit";
    }

    @PostMapping("editProduct")
    public String updateProduct(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam double price,
                                @RequestParam String des) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(des);
        boolean result = productService.update(product);
        if (result) {
            return "redirect:/product";
        } else {
            return "error";
        }
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