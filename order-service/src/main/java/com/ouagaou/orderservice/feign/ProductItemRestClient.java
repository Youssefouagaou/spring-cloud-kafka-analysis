package com.ouagaou.orderservice.feign;


import com.ouagaou.orderservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {

    @GetMapping(path = "/products?projection=full")
    PagedModel<Product> pageProducts(@RequestParam(name = "page") int page,
                                     @RequestParam(name = "size") int size);
    @GetMapping(path = "/products/{id}?projection=full")
    Product getProductById(@PathVariable String id);
}
