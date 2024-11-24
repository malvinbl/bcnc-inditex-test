package org.bcnc.inditex.test.api.infrastructure.adapter.out.repository;

import org.bcnc.inditex.test.api.domain.port.out.PriceRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class PriceRepositoryAdapter implements PriceRepositoryPort {

    @Override
    public String findPricingDetails() {
        return "findPricingDetails";
    }

}
