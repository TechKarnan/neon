package neon.example.neon.controller;

import neon.example.neon.entity.Product;
import neon.example.neon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ReatilController {


    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public String test(){
        return "Springboot App is running...!";
        };

    @PostMapping("/product")
    public Product save(@RequestBody  Product p){
        return productService.saveProduct(p);
    }

    @GetMapping("/products")
    public List<Product> fetchProducts(){
        return productService.fetch();
    }
}
