package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.Official;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficialRepository extends JpaRepository<Official, Long> {
  // Add any additional query methods if needed
}
