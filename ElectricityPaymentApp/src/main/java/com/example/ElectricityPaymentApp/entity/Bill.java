package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Bill {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private double amount;
  private LocalDate dueDate;

  @ManyToOne
  private Consumer consumer;

  // Constructors, getters, and setters

  public Bill() {
  }

  public Bill(double amount, LocalDate dueDate, Consumer consumer) {
    this.amount = amount;
    this.dueDate = dueDate;
    this.consumer = consumer;
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

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Consumer getConsumer() {
    return consumer;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }
}
