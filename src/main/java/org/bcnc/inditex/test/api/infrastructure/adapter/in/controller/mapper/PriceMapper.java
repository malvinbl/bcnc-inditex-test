package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller.mapper;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.infrastructure.adapter.in.controller.dto.response.PriceDetailResponse;
import org.springframework.stereotype.Component;

@Component
public class PriceMapper {

    public PriceDetailResponse toPriceDetailResponse(PriceDetail priceDetail) {
        return new PriceDetailResponse(priceDetail.productId(), priceDetail.brandId(), priceDetail.priceList(), priceDetail.date(), priceDetail.price());
    }

}
