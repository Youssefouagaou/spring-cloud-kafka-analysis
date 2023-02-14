package com.ouagaou.orderservice.entities;

import com.ouagaou.orderservice.enums.OrderStatus;
import com.ouagaou.orderservice.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(types = Order.class, name = "full")
public interface OrderProjectio {
     String getId();
     Date getCreated();
     OrderStatus getStatus();
     Long getCustomerId();
     Customer getCustomer();
     Collection<ProductItem> getGroducts();
}

