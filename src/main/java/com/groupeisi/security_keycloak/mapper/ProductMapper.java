package com.groupeisi.security_keycloak.mapper;

import com.groupeisi.security_keycloak.dto.ProductDTO;
import com.groupeisi.security_keycloak.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product) {
        return new ProductDTO(product.getId(), product.getRef(), product.getName());
    }

    public Product toEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setRef(productDTO.getRef());
        product.setName(productDTO.getName());
        return product;
    }
}
