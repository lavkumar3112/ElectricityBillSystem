package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.dto.OfficialDTO;
import com.example.ElectricityPaymentApp.entity.Official;
import com.example.ElectricityPaymentApp.repository.OfficialRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

  private final OfficialRepository officialRepository;

  public AdminService(OfficialRepository officialRepository) {
    this.officialRepository = officialRepository;
  }

  public void registerOfficial(OfficialDTO officialDTO) {
    // Implement logic to register new officials
    // Create Official entity from DTO and save it to the database
    Official official = new Official();
    official.setName(officialDTO.getName());
    official.setEmail(officialDTO.getEmail());
    // Set other properties as needed
    officialRepository.save(official);
  }
}
