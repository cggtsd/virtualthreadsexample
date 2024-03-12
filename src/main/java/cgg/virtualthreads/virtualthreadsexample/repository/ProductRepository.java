package cgg.virtualthreads.virtualthreadsexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.virtualthreads.virtualthreadsexample.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
