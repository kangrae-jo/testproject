package com.kng.testproject.service;

import com.kng.testproject.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productID,String productName, int productPrice, int productStock);

    ProductDto getProduct(String productID);
}
