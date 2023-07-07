package com.example.ElectricityPaymentApp.dto;

public class OfficialDTO {
  private String name;
  private String email;

  // Constructors, getters, and setters

  public OfficialDTO() {
  }

  public OfficialDTO(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
