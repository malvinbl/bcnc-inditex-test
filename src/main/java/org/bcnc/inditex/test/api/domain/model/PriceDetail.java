package org.bcnc.inditex.test.api.domain.model;

import java.time.LocalDateTime;

public record PriceDetail(
    LocalDateTime startDate,
    LocalDateTime entDate,
    Long productId,
    Long brandId,
    Long priceList,
    Integer priority,
    Double price
    ) {
}
