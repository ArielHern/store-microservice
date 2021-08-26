package service;

import lombok.extern.slf4j.Slf4j;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct(){
        log.info("Inside getAllProduct of ProductService");
        return repository.findAll();
    }

    public void createProduct(Product product){
        log.info("Inside createProduct of ProductService");
        repository.save(product);
    }
}
