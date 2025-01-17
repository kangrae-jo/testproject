package com.kng.testproject.data.handler;

import com.kng.testproject.data.entity.Product;

public interface ProductDataHandler {

    Product saveProductEntity(String productId, String productName, int productPrice, int productStock);

    Product getProductEntity(String productId);
}
