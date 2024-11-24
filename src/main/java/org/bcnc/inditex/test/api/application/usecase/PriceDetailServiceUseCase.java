package org.bcnc.inditex.test.api.application.usecase;

import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.bcnc.inditex.test.api.domain.port.out.PriceRepositoryPort;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PriceDetailServiceUseCase implements PriceDetailService {

    private final PriceRepositoryPort priceRepositoryPort;

    @Override
    public String getPricingDetails() {
        return priceRepositoryPort.findPricingDetails();
    }

}
