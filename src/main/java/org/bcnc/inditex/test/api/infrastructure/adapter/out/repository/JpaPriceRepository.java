package org.bcnc.inditex.test.api.infrastructure.adapter.out.repository;

import org.bcnc.inditex.test.api.infrastructure.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@Repository
public interface JpaPriceRepository extends JpaRepository<PriceEntity, Long> {

    @Query(value =
        "SELECT * from price " +
        "WHERE :date between start_date AND end_date " +
        "AND product_id = :productId " +
        "AND brand_id = :brandId ;",
        nativeQuery = true)
    Stream<PriceEntity> findByParams(Long productId, Long brandId, LocalDateTime date);

}
