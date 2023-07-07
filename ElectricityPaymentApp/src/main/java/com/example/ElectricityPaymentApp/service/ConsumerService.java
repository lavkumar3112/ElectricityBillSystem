package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.dto.BillDTO;
import com.example.ElectricityPaymentApp.entity.Bill;
import com.example.ElectricityPaymentApp.entity.Consumer;
import com.example.ElectricityPaymentApp.exception.NotFoundException;
import com.example.ElectricityPaymentApp.repository.BillRepository;
import com.example.ElectricityPaymentApp.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsumerService {

  private final ConsumerRepository consumerRepository;
  private final BillRepository billRepository;

  public ConsumerService(ConsumerRepository consumerRepository, BillRepository billRepository) {
    this.consumerRepository = consumerRepository;
    this.billRepository = billRepository;
  }

  public List<BillDTO> getBillsByConsumerId(Long consumerId) {
    // Implement logic to fetch bills for a specific consumer
    // Fetch consumer from database based on consumerId
    Consumer consumer = consumerRepository.findById(consumerId)
      .orElseThrow(() -> new NotFoundException("Consumer not found"));

    // Fetch bills associated with the consumer
    List<Bill> bills = billRepository.findByConsumer(consumer);

    // Convert bills to BillDTOs and return the list
    return bills.stream()
      .map(this::convertToBillDTO)
      .collect(Collectors.toList());
  }

  private BillDTO convertToBillDTO(Bill bill) {
    // Convert Bill entity to BillDTO
    BillDTO billDTO = new BillDTO();
    billDTO.setId(bill.getId());
    billDTO.setAmount(bill.getAmount());
    // Set other properties as needed
    return billDTO;
  }
}
