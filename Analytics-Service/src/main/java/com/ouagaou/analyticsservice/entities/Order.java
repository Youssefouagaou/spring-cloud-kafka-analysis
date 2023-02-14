package com.ouagaou.analyticsservice.entities;


import com.ouagaou.analyticsservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Collection;
import java.util.Date;


@AllArgsConstructor @NoArgsConstructor @Data

public class Order {

    private String id;
    private Date created;
    private String status;
    private Long customerId;
    private Customer customer;
    private Collection<ProductItem> products;

}
