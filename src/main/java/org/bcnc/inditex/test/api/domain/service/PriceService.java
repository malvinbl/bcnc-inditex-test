package org.bcnc.inditex.test.api.domain.service;

import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PriceService {

    private final PriceDetailService priceDetailService;

    public String getPricingDetails() {
        return priceDetailService.getPricingDetails();
    }

}
