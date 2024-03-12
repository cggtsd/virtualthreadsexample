package cgg.virtualthreads.virtualthreadsexample.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.virtualthreads.virtualthreadsexample.entity.Product;
import cgg.virtualthreads.virtualthreadsexample.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private ProductRepository productRepo;

    public ProductController(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public List<Product> getProducts() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Thread info {} ", Thread.currentThread());
        return productRepo.findAll();
    }

}
