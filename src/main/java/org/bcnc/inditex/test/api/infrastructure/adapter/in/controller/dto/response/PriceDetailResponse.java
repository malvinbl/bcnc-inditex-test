package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record PriceDetailResponse(
    Long productId,
    Long brandId,
    Long priceList,
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime date,
    Double price
    ) {
}