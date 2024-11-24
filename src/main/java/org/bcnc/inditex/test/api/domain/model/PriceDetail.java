package org.bcnc.inditex.test.api.domain.model;

public record PriceDetail(
    Long productId,
    Long brandId,
    Long priceList,
    String date,
    Double price
    ) {
}
