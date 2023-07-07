package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.dto.ConsumerDTO;
import com.example.ElectricityPaymentApp.service.DepartmentOfficialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/officials")
public class DepartmentOfficialController {

  private final DepartmentOfficialService departmentOfficialService;

  public DepartmentOfficialController(DepartmentOfficialService departmentOfficialService) {
    this.departmentOfficialService = departmentOfficialService;
  }

  @PostMapping("/consumers")
  public ResponseEntity<?> registerConsumer(@RequestBody ConsumerDTO consumerDTO) {
    // Implement logic to register new consumers
    // Generate a unique ID, validate input, save consumer details, etc.
    departmentOfficialService.registerConsumer(consumerDTO);
    return ResponseEntity.ok().build();
  }
}

