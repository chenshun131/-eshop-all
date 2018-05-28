package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.ProductProperty;

public interface ProductPropertyService {

    void add(ProductProperty productProperty, String operationType);

    void update(ProductProperty productProperty, String operationType);

    void delete(Long id, String operationType);

    ProductProperty findById(Long id);

    ProductProperty findByProductId(Long productId);

}
