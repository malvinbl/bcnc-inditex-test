package org.bcnc.inditex.test.api.application.usecase;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.bcnc.inditex.test.api.domain.port.out.PriceRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Comparator;

@Service
public class PriceDetailServiceUseCase implements PriceDetailService {

    private final PriceRepositoryPort priceRepositoryPort;
    private final Comparator<PriceDetail> pricePriorityComparator;

    public PriceDetailServiceUseCase(PriceRepositoryPort priceRepositoryPort) {
        this.priceRepositoryPort = priceRepositoryPort;
        this.pricePriorityComparator = Comparator.comparing(PriceDetail::priority);
    }

    @Transactional(readOnly = true)
    @Override
    public PriceDetail getPriceDetail(Long productId, Long brandId, LocalDateTime date) {
        return priceRepositoryPort.findPricingDetails(productId, brandId, date)
            .max(pricePriorityComparator)
            .orElse(null);
    }

}
