package com.ouagaou.Inventoryservice;

import com.ouagaou.Inventoryservice.entities.Product;
import com.ouagaou.Inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	// 25:00
	@Bean
	CommandLineRunner start(ProductRepository pr)
	{
		return args -> {
			Stream.of("Lenovo", "Dell", "HP", "Mac", "Samsung", "huawei").forEach(p -> {
				Product product = new Product();
				product.setId(UUID.randomUUID().toString());
				product.setPrice(Math.random() * 8260);
				product.setName(p);
				product.setQuantity((int) (Math.random() * 90));
				pr.save(product);
			});
		};
	}
}
