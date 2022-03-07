package com.mohan.ms.client;

import com.mohan.ms.service.dto.ProductReviewDTO;

import java.util.List;

public class ProductReviewFeignClientFallback implements ProductReviewFeignClient {


    @Override
    public List<ProductReviewDTO> getAllReviewByProductId(String productId) {
        return null;
    }
}