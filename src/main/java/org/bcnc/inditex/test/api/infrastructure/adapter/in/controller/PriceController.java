package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.service.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Tag(name = "Price Controller")
@RequiredArgsConstructor
@RequestMapping("/prices")
@RestController
public class PriceController {

    private final PriceService priceService;

    @Operation(summary = "Get pricing details")
    @GetMapping("/details")
    public ResponseEntity<String> getPricingDetails(
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        @RequestParam(name = "date")
        LocalDateTime date,

        @RequestParam(name = "productId")
        Long productId,

        @RequestParam(name = "brandId")
        Long brandId
    ) {
        String pricingDetails = priceService.getPricingDetails();
        return ResponseEntity.ok(pricingDetails);
    }

}
