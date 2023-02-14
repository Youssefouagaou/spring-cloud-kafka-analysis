package com.ouagaou.analyticsservice.entities;

import com.ouagaou.analyticsservice.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProductItem {

    private Long id;
    private double quantity;
    private double price;
    private String productId;

    private Product product;

    private Order order;



}
