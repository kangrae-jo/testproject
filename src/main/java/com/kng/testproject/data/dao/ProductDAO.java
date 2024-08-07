package com.kng.testproject.data.dao;

import com.kng.testproject.data.entity.Product;

public interface ProductDAO {

    Product saveProduct(Product product);

    Product getProduct(String productId);
}
