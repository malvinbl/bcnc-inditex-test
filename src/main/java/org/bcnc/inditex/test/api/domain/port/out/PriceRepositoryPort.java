package org.bcnc.inditex.test.api.domain.port.out;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public interface PriceRepositoryPort {

    Stream<PriceDetail> findPricingDetails(Long productId, Long brandId, LocalDateTime date);

}
