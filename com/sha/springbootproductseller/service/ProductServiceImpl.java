package com.sha.springbootproductseller.service;
import com.sha.springbootproductseller.model.Product;
import com.sha.springbootproductseller.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());

        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
