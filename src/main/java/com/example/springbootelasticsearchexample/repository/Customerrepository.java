package com.example.springbootelasticsearchexample.repository;

import com.example.springbootelasticsearchexample.model.customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface Customerrepository extends ElasticsearchRepository<customer, String> {
    List<customer> findByfirstname(String firstname);
}
