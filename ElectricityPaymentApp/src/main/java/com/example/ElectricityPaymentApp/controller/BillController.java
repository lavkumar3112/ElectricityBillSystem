package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.dto.BillGenerationRequestDTO;
import com.example.ElectricityPaymentApp.service.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillController {

  private final BillService billService;

  public BillController(BillService billService) {
    this.billService = billService;
  }

  @PostMapping("/generate")
  public ResponseEntity<?> generateMonthlyBill(@RequestBody BillGenerationRequestDTO requestDTO) {
    // Implement logic to generate monthly bills for consumers
    billService.generateMonthlyBill(requestDTO);
    return ResponseEntity.ok().build();
  }
}
