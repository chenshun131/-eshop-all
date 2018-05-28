package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.ProductSpecification;

public interface ProductSpecificationService {

    void add(ProductSpecification productSpecification, String operationType);

    void update(ProductSpecification productSpecification, String operationType);

    void delete(Long id, String operationType);

    ProductSpecification findById(Long id);

    ProductSpecification findByProductId(Long productId);

}
