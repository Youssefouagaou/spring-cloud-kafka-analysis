package com.ouagaou.kafkabillingproducer.services;

import com.ouagaou.kafkabillingproducer.entities.Order;
import com.ouagaou.kafkabillingproducer.enums.OrderStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.function.Supplier;

@Service
public class BillService {


    @Bean
    public Supplier<Order> BillSupplier()
    {
        return () ->  new Order(null, new Date(), Math.random() > 0.5 ? OrderStatus.CREATED : OrderStatus.PENDING, Math.random() > 0.5 ? Math.random() > 0.5 ? 1L : 2L : Math.random() > 0.5 ? 3L : 4L, null, null);
    }




}
