package org.bcnc.inditex.test.api.infrastructure.adapter.out.repository;

import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.domain.port.out.PriceRepositoryPort;
import org.bcnc.inditex.test.api.infrastructure.adapter.out.repository.mapper.PriceEntityMapper;
import org.bcnc.inditex.test.api.infrastructure.entity.PriceEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Component
public class PriceRepositoryAdapter implements PriceRepositoryPort {

    private final JpaPriceRepository jpaPriceRepository;
    private final PriceEntityMapper priceEntityMapper;

    @Override
    public Stream<PriceDetail> findPricingDetails(Long productId, Long brandId, LocalDateTime date) {
        Stream<PriceEntity> priceEntities = jpaPriceRepository.findByParams(productId, brandId, date);
        return priceEntityMapper.toPriceDetailStream(priceEntities);
    }

}
