package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller.dto.response;

public record PriceDetailResponse(
    Long productId,
    Long brandId,
    Long priceList,
    String date,
    Double price
    ) {
}
