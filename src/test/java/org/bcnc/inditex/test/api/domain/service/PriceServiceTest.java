package org.bcnc.inditex.test.api.domain.service;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.in.PriceDetailService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PriceServiceTest {

    private @Mock PriceDetailService priceDetailService;
    private @InjectMocks PriceService priceService;

    @Test
    void should_get_priceDetail_given_productId_and_brandId_and_date() {
        Long productId = 35455L;
        Long brandId = 1L;

        LocalDateTime date = LocalDateTime.of(2020,6,14, 10, 0);

        LocalDateTime startDate = LocalDateTime.of(2020,6,14, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2020,12,31, 23, 59);

        PriceDetail expectedResponse = new PriceDetail(
            startDate,
            endDate,
            productId,
            brandId,
            1L,
            0,
            35.50
        );

        when(priceDetailService.getPriceDetail(productId, brandId, date)).thenReturn(expectedResponse);


        PriceDetail actualResponse = priceService.getPriceDetail(productId, brandId, date);


        assertThat(actualResponse).usingRecursiveComparison().isEqualTo(expectedResponse);
    }

}