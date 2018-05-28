package com.chenshun.eshopdatasyncservice.service.fallback;

import com.chenshun.eshopdatasyncservice.service.EshopProductService;
import org.springframework.stereotype.Component;

@Component
public class EshopProductServiceFallback implements EshopProductService {

    public String findBrandById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findBrandByIds(String ids) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findCategoryById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findProductIntroById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findProductPropertyById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findProductById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public String findProductSpecificationById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
