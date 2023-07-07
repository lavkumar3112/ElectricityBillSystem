package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.dto.ConsumerDTO;
import com.example.ElectricityPaymentApp.entity.Consumer;
import com.example.ElectricityPaymentApp.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentOfficialService {

  private final ConsumerRepository consumerRepository;

  public DepartmentOfficialService(ConsumerRepository consumerRepository) {
    this.consumerRepository = consumerRepository;
  }

  public void registerConsumer(ConsumerDTO consumerDTO) {
    // Implement logic to register new consumers
    // Create Consumer entity from DTO and save it to the database
    Consumer consumer = new Consumer();
    consumer.setName(consumerDTO.getName());
    consumer.setGroupId(consumerDTO.getGroupId());
    // Set other properties as needed
    consumerRepository.save(consumer);
  }
}
