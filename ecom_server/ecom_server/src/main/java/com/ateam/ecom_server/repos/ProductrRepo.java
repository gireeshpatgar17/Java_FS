package com.ateam.ecom_server.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ateam.ecom_server.models.Product;

public interface ProductrRepo extends MongoRepository<Product, String> {

}
