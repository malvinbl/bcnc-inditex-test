package org.bcnc.inditex.test.api.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@RequiredArgsConstructor
@Service
public class PriceService {

    private final PriceDetailService priceDetailService;

    public PriceDetail getPriceDetail(Long productId, Long brandId, LocalDateTime date) {
        log.info("Getting price detail - productId [{}] brandId [{}] date [{}]", productId, brandId, date);
        return priceDetailService.getPriceDetail(productId, brandId, date);
    }

}
