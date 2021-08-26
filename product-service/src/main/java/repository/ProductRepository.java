package repository;

import model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
