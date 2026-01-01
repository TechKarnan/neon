package neon.example.neon.service;

import neon.example.neon.entity.Product;
import neon.example.neon.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> fetch(){
        return productRepo.findAll();
    }
}
