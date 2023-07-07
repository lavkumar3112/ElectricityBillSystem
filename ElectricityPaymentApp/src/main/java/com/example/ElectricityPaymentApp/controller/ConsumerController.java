package com.example.ElectricityPaymentApp.controller;


import com.example.ElectricityPaymentApp.dto.BillDTO;
import com.example.ElectricityPaymentApp.service.ConsumerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

  private final ConsumerService consumerService;

  public ConsumerController(ConsumerService consumerService) {
    this.consumerService = consumerService;
  }

  @GetMapping("/{consumerId}/bills")
  public ResponseEntity<List<BillDTO>> getBillsByConsumerId(@PathVariable Long consumerId) {
    // Implement logic to fetch bills for a specific consumer
    List<BillDTO> bills = consumerService.getBillsByConsumerId(consumerId);
    return ResponseEntity.ok(bills);
  }
}
