package com.plygrnd.produc.service.repository;

import com.plygrnd.produc.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
