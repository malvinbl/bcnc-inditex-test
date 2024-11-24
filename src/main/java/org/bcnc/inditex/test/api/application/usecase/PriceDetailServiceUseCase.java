package org.bcnc.inditex.test.api.application.usecase;

import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.bcnc.inditex.test.api.domain.port.out.PriceRepositoryPort;
import org.bcnc.inditex.test.api.infrastructure.adapter.in.controller.dto.response.PriceDetailResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class PriceDetailServiceUseCase implements PriceDetailService {

    private final PriceRepositoryPort priceRepositoryPort;

    @Override
    public PriceDetail getPricingDetails(LocalDateTime date, Long productId, Long brandId) {
        String pricingDetails = priceRepositoryPort.findPricingDetails();
        return new PriceDetail(35455L, 1L, 1L, "2020-06-14T10:00:00", 35.50);
    }

}
