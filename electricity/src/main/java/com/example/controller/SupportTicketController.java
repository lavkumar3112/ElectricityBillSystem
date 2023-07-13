package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SupportTicketService;

@RestController
@RequestMapping("/support-tickets")
public class SupportTicketController {
	
	@Autowired
  private final SupportTicketService supportTicketService;

  public SupportTicketController(SupportTicketService supportTicketService) {
    this.supportTicketService = supportTicketService;
  }

  // Implement support ticket-related endpoints
}
