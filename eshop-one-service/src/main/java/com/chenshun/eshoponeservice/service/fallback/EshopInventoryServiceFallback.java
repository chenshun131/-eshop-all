package com.chenshun.eshoponeservice.service.fallback;

import com.chenshun.eshoponeservice.service.EshopInventoryService;
import org.springframework.stereotype.Component;

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
	
	public String findByProductId(Long productId) {
		return "降级库存数据";
	}

}
