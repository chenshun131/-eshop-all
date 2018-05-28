package com.chenshun.eshopinventoryservice.service;

import com.chenshun.eshopinventoryservice.model.ProductInventory;

public interface ProductInventoryService {

    void add(ProductInventory productInventory);

    void update(ProductInventory productInventory);

    void delete(Long id);

    ProductInventory findById(Long id);

    ProductInventory findByProductId(Long productId);

}
