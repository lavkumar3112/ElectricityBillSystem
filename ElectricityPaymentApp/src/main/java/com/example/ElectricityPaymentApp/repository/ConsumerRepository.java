package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
  // Add any additional query methods if needed
}
