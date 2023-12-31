package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.Bill;
import com.example.ElectricityPaymentApp.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, String> {
    List<Bill> findByConsumer(Consumer consumer);
    // Custom queries if needed
}
