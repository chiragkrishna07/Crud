package com.example.springbootelasticsearchexample;

import com.example.springbootelasticsearchexample.model.customer;
import com.example.springbootelasticsearchexample.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootElasticSearchExampleApplication {

	@Autowired
	private Customerrepository repository;
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<customer> customers) {
		repository.saveAll(customers);
		return customers.size();
	}

	@GetMapping("/findAll")
	public Iterable<customer> findAllcustomer() {
		return repository.findAll();
	}

	@GetMapping("/findbyFname/{firstname}")
		public List<customer> findByFirstname(@PathVariable String firstname) {
		return repository.findByfirstname(firstname);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootElasticSearchExampleApplication.class, args);
	}

}
