package com.example.springbootelasticsearchexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="examples")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class customer {

    private String firstname;
    private String lastname;
    @Id
    private String id;
    private int age;
}
