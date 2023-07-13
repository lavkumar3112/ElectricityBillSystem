package com.example.service;

import org.springframework.stereotype.Service;

import com.example.repository.SupportTicketRepository;

@Service
public class SupportTicketService {
  private final SupportTicketRepository supportTicketRepository;
  private final ConsumerService consumerService;

  public SupportTicketService(SupportTicketRepository supportTicketRepository, ConsumerService consumerService) {
    this.supportTicketRepository = supportTicketRepository;
    this.consumerService = consumerService;
  }

  // Implement methods for support ticket-related operations
}

