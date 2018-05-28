package com.chenshun.eshoponeservice.service;

import com.chenshun.eshoponeservice.service.fallback.EshopInventoryServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eshop-inventory-service", fallback = EshopInventoryServiceFallback.class)
public interface EshopInventoryService {

    @RequestMapping(value = "/product-inventory/findByProductId", method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);

}