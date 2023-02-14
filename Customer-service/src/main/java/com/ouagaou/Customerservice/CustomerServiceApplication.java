package com.ouagaou.Customerservice;

import com.ouagaou.Customerservice.entities.Customer;
import com.ouagaou.Customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.stream.Stream;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository cr, RepositoryRestConfiguration r)
	{
		return args -> {
			r.exposeIdsFor(Customer.class);
			Stream.of("ouagaou","youssef", "Sanae", "Ali").forEach(c -> {
				Customer customer = new Customer();
				customer.setEmail(c.toLowerCase()+"@gmail.com");
				customer.setName(c.toUpperCase());
				cr.save(customer);
			});
		};
	}

}
