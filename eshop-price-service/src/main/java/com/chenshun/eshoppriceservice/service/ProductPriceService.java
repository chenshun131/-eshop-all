package com.chenshun.eshoppriceservice.service;

import com.chenshun.eshoppriceservice.model.ProductPrice;

public interface ProductPriceService {

    void add(ProductPrice productPrice);

    void update(ProductPrice productPrice);

    void delete(Long id);

    ProductPrice findById(Long id);

    ProductPrice findByProductId(Long id);

}
