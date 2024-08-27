package com.kng.testproject.data.dao.impl;

import com.kng.testproject.data.dao.ProductDAO;
import com.kng.testproject.data.entity.ProductEntity;
import com.kng.testproject.data.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        Optional<ProductEntity> productEntity = productRepository.findById(productId);
        return productEntity.orElse(null);
    }
}
