package com.chenshun.eshoppriceservice.model;

import lombok.Data;

@Data
public class ProductPrice {

    private Long id;

    private Double value;

    private Long productId;

}
