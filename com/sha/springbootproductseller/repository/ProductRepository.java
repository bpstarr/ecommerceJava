package com.sha.springbootproductseller.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sha.springbootproductseller.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
