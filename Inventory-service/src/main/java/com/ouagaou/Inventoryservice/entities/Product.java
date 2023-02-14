package com.ouagaou.Inventoryservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
