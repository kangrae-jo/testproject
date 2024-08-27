package com.kng.testproject.data.dao;

import com.kng.testproject.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity product);

    ProductEntity getProduct(String productId);
}
