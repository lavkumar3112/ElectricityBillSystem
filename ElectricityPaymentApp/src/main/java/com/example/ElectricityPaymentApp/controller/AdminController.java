package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.dto.OfficialDTO;
import com.example.ElectricityPaymentApp.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  private final AdminService adminService;

  public AdminController(AdminService adminService) {
    this.adminService = adminService;
  }

  @PostMapping("/officials")
  public ResponseEntity<?> registerOfficial(@RequestBody OfficialDTO officialDTO) {
    // Implement logic to register new officials
    // Validate input, save official details, etc.
    adminService.registerOfficial(officialDTO);
    return ResponseEntity.ok().build();
  }
}
