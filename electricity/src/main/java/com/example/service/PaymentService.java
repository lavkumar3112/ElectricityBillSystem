package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bill;
import com.example.exception.NotFoundException;
import com.example.payloads.Payment;
import com.example.repository.BillRepository;

@Service
public class PaymentService {

  @Autowired
  private BillRepository billRepository;

  @Autowired
  private Payment payment;

  public Bill makePayment(Long billId, double paymentAmount) {
    Bill bill = billRepository.findById(String.valueOf(billId))
      .orElseThrow(() -> new NotFoundException("Bill", "Bill ID", billId));

    // Perform payment processing logic
    payment.processPayment(bill.getAmount(), paymentAmount);

    // Mark the bill as paid
    bill.setPaid(true);

    // Save the updated bill
    return billRepository.save(bill);
  }
}
