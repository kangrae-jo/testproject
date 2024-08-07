package com.kng.testproject.service;


import com.kng.testproject.data.dto.ProductDto;
import com.kng.testproject.data.entity.Product;
import com.kng.testproject.data.handler.ProductDataHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler){
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock){
        Product product = productDataHandler.saveProductEntity(productId,productName,productPrice,productStock);

        ProductDto productDto = new ProductDto(product.getProductId(),
                product.getProductName(), product.getProductPrice(), product.getProductStock());

        return productDto;
    }

    @Override
    public ProductDto getProduct(String productId){
        Product product = productDataHandler.getProductEntity(productId);

        ProductDto productDto = new ProductDto(product.getProductId(),
                product.getProductName(), product.getProductPrice(), product.getProductStock());

        return productDto;
    }
}
