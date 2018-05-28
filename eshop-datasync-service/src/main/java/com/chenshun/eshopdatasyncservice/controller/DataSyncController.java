package com.chenshun.eshopdatasyncservice.controller;

import com.chenshun.eshopdatasyncservice.service.EshopProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSyncController {

    @Autowired
    private EshopProductService eshopProductService;

    @RequestMapping("/findBrandById")
    public String findBrandById(Long id) {
        return eshopProductService.findBrandById(id);
    }

}
