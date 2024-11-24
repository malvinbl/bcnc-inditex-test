package org.bcnc.inditex.test.api.infrastructure.adapter.in.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.bcnc.inditex.test.api.domain.service.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Price Controller")
@RequiredArgsConstructor
@RequestMapping("/prices")
@RestController
public class PriceController {

    private final PriceService priceService;

    @Operation(summary = "Get pricing details")
    @GetMapping("/details")
    public ResponseEntity<String> getPricingDetails() {
        String pricingDetails = priceService.getPricingDetails();
        return ResponseEntity.ok(pricingDetails);
    }

}
