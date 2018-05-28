package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.ProductIntro;

public interface ProductIntroService {

    void add(ProductIntro productIntro, String operationType);

    void update(ProductIntro productIntro, String operationType);

    void delete(Long id, String operationType);

    ProductIntro findById(Long id);

}
