package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Bill;
import com.example.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @PostMapping("/{billId}")
  public Bill makePayment(@PathVariable Long billId, @RequestBody double paymentAmount) {
    return paymentService.makePayment(billId, paymentAmount);
  }
}
