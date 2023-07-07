package com.example.ElectricityPaymentApp.dto;

public class BillGenerationRequestDTO {
  private Long consumerId;
  private double unitsConsumed;

  // Constructors, getters, and setters

  public BillGenerationRequestDTO() {
  }

  public BillGenerationRequestDTO(Long consumerId, double unitsConsumed) {
    this.consumerId = consumerId;
    this.unitsConsumed = unitsConsumed;
  }

  // Getters and Setters

  public Long getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Long consumerId) {
    this.consumerId = consumerId;
  }

  public double getUnitsConsumed() {
    return unitsConsumed;
  }

  public void setUnitsConsumed(double unitsConsumed) {
    this.unitsConsumed = unitsConsumed;
  }
}
