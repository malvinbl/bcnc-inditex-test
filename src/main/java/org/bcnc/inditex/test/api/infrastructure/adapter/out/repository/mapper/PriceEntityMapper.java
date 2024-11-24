package org.bcnc.inditex.test.api.infrastructure.adapter.out.repository.mapper;

import org.bcnc.inditex.test.api.domain.model.PriceDetail;
import org.bcnc.inditex.test.api.infrastructure.entity.PriceEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@Component
public class PriceEntityMapper {

    public Stream<PriceDetail> toPriceDetailStream(Stream<PriceEntity> priceEntities, LocalDateTime date) {
        return priceEntities.map(priceEntity -> toPriceDetail(priceEntity, date));
    }

    private PriceDetail toPriceDetail(PriceEntity priceEntity, LocalDateTime date) {
        return new PriceDetail(
            date,
            priceEntity.getProductEntity().getId(),
            priceEntity.getBrandEntity().getId(),
            priceEntity.getPriceList().getId(),
            priceEntity.getPriority(),
            priceEntity.getPrice()
        );
    }

}
