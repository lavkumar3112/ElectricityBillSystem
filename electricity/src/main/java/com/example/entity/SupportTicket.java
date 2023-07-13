package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SupportTicket {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ticketId;
  private String userId;
  private String category;
  private String description;
  private String status;
  private String assignedStaffId;
  // Constructor, getters, and setters
}
