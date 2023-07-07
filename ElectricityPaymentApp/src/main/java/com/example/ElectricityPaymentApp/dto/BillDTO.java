package com.example.ElectricityPaymentApp.dto;

public class BillDTO {
  private Long id;
  private double amount;
  // Add any additional properties as needed

  // Constructors, getters, and setters

  public BillDTO() {
  }

  public BillDTO(Long id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  // Getters and Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
