package com.ouagaou.Inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class, name = "full")
public interface ProductProjection {
    String getId();
    String getName();
    double getPrice();
    int getQuantity();

}
