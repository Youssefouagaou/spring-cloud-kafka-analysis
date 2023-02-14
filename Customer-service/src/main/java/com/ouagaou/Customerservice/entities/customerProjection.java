package com.ouagaou.Customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Customer.class, name = "full")
public interface customerProjection {
    Long getId();
    String getName();
    String getEmail();

}
