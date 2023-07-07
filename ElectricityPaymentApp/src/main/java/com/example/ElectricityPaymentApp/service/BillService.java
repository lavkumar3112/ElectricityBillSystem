package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.dto.BillGenerationRequestDTO;
import com.example.ElectricityPaymentApp.entity.Bill;
import com.example.ElectricityPaymentApp.entity.Consumer;
import com.example.ElectricityPaymentApp.exception.NotFoundException;
import com.example.ElectricityPaymentApp.repository.BillRepository;
import com.example.ElectricityPaymentApp.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {

  private final ConsumerRepository consumerRepository;
  private final BillRepository billRepository;

  public BillService(ConsumerRepository consumerRepository, BillRepository billRepository) {
    this.consumerRepository = consumerRepository;
    this.billRepository = billRepository;
  }

  public void generateMonthlyBill(BillGenerationRequestDTO requestDTO) {
    // Implement logic to generate monthly bills for consumers
    // Fetch consumer from database based on consumerId
    Consumer consumer = consumerRepository.findById(requestDTO.getConsumerId())
      .orElseThrow(() -> new NotFoundException("Consumer not found"));

    // Calculate bill amount based on units consumed and rate for the consumer's group
    double billAmount = requestDTO.getUnitsConsumed() * consumer.getRate();

    // Create and save the bill entity
    Bill bill = new Bill();
    bill.setConsumer(consumer);
    bill.setAmount(billAmount);
    // Set other properties as needed
    billRepository.save(bill);
  }
}

