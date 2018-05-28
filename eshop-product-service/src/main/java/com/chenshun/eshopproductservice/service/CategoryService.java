package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.Category;

public interface CategoryService {

    void add(Category category, String operationType);

    void update(Category category, String operationType);

    void delete(Long id, String operationType);

    Category findById(Long id);

}
