package org.bcnc.inditex.test.api.domain.service;

import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class PriceService {

    private final PriceDetailService priceDetailService;

    public PriceDetail getPricingDetails(LocalDateTime date, Long productId, Long brandId) {
        return priceDetailService.getPricingDetails(date, productId, brandId);
    }

}
