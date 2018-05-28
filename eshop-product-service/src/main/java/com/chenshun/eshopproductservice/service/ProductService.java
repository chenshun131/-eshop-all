package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.Product;

public interface ProductService {

    void add(Product product, String operationType);

    void update(Product product, String operationType);

    void delete(Long id, String operationType);

    Product findById(Long id);

}
