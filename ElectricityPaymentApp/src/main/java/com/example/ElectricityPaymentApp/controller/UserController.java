package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }
  public void display(){
    System.out.println("Created");
  }

  // Implement user-related endpoints
}
