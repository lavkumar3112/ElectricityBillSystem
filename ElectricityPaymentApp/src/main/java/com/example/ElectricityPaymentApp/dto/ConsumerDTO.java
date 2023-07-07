package com.example.ElectricityPaymentApp.dto;

public class ConsumerDTO {
  private String name;
  private String groupId;

  // Constructors, getters, and setters

  public ConsumerDTO() {
  }

  public ConsumerDTO(String name, String groupId) {
    this.name = name;
    this.groupId = groupId;
  }

  // Getters and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }
}
