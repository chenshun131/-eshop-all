package com.chenshun.eshopproductservice.service;

import com.chenshun.eshopproductservice.model.Brand;

import java.util.List;

public interface BrandService {

     void add(Brand brand, String operationType);

     void update(Brand brand, String operationType);

     void delete(Long id, String operationType);

     Brand findById(Long id);

     List<Brand> findByIds(String ids);

}
