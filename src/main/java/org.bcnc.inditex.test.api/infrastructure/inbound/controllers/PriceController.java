package org.bcnc.inditex.test.infrastructure.inbound.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @PostMapping("/price_detail")
    public ResponseEntity<String> priceDetail() {
        return ResponseEntity.ok("response");
    }

}
