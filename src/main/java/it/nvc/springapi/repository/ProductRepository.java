package it.nvc.springapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.nvc.springapi.model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{
    public List<Product> findByNameContaining(String name);
}
