package com.groupeisi.security_keycloak.controller;

import com.groupeisi.security_keycloak.dto.ProductDTO;
import com.groupeisi.security_keycloak.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam String ref, @RequestParam String name) {
        ProductDTO productDTO = new ProductDTO(null, ref, name);
        productService.addProduct(productDTO);
        return "redirect:/products";
    }
}
