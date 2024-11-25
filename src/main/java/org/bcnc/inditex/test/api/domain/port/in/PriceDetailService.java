package org.bcnc.inditex.test.api.domain.port.in;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;

import java.time.LocalDateTime;

public interface PriceDetailService {

    PriceDetail getPriceDetail(Long productId, Long brandId, LocalDateTime date);

}
