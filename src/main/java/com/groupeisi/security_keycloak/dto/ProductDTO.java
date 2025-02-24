package com.groupeisi.security_keycloak.dto;

public class ProductDTO {
    private Long id;
    private String ref;
    private String name;

    public ProductDTO() {}

    public ProductDTO(Long id, String ref, String name) {
        this.id = id;
        this.ref = ref;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
