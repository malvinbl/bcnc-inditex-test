package org.bcnc.inditex.test.api.domain.service;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PriceServiceTest {

    PriceRepositoryPort priceRepositoryPort = mock(PriceRepositoryPort.class);

    PriceService priceService = new PriceService(
        new PriceDetailServiceUseCase(
            priceRepositoryPort
        )
    );

    @Test
    void should_get_priceDetail_given_productId_and_brandId_and_date() {
        Long productId = 35455L;
        Long brandId = 1L;
        LocalDateTime date = LocalDateTime.of(2020,6,14, 10, 0);

        PriceDetail expectedResponse = new PriceDetail(
            date,
            productId,
            brandId,
            1L,
            0,
            35.50
        );

        when(priceRepositoryPort.findPricingDetails(productId, brandId, date)).thenReturn(Stream.of(expectedResponse));


        PriceDetail actualResponse = priceService.getPriceDetail(productId, brandId, date);


        assertThat(actualResponse).usingRecursiveComparison().isEqualTo(expectedResponse);
    }

}