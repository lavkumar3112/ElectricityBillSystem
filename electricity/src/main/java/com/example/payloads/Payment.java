package com.example.payloads;

import org.springframework.stereotype.Component;

@Component
public class Payment {

	// Method to calculate the total bill amount based on consumption
    public static double calculateBillAmount(double perUnitRate, double totalConsumption) {
        return perUnitRate * totalConsumption;
    }

    // Method to determine the per unit rate based on consumption tiers
    public static double determinePerUnitRate(double totalConsumption, String tariff) {
        // Define consumption tiers and their corresponding rates
        double[] consumptionTiers = {100, 200, 300};
        double[] ratesHousehold = {0.8, 1.0, 1.2, 1.5}; // Example rates per unit
        double[] ratesIndustrial = {1.2, 1.5, 1.8, 2.1}; // Example rates per unit
        double[] ratesPublic = {1.5, 1.8, 2.1, 2.4}; // Example rates per unit

        // Find the applicable rate based on the consumption tier
        int tier = 0;
        while (tier < consumptionTiers.length && totalConsumption > consumptionTiers[tier]) {
            tier++;
        }

        // Return the rate for the corresponding tier
        if(tariff.equals("HOUSEHOLD"))
        return ratesHousehold[tier];

        else if(tariff.equals("INDUSTRIAL"))
            return ratesIndustrial[tier];

        return ratesPublic[tier];      // PUBLIC
    }


  public void processPayment(double totalAmount, double paymentAmount) {
    // Example implementation for a payment gateway
    // Replace this with the actual implementation for your payment gateway

    if (paymentAmount >= totalAmount) {
      // Call the payment gateway API or SDK to process the payment
      boolean paymentSuccessful = makePayment(totalAmount);

      if (paymentSuccessful) {
        // Payment was successful, mark the bill as paid
        markBillAsPaid();
        System.out.println("Payment processed successfully.");
      } else {
        // Payment failed or was declined
        System.out.println("Payment failed. Please try again or contact customer support.");
      }
    } else {
      // Insufficient payment amount
      System.out.println("Insufficient payment amount. Please provide the correct payment amount.");
    }
  }

  private boolean makePayment(double amount) {
    // Implementation for making the payment using the payment gateway API or SDK
    // Replace this with the actual API or SDK calls specific to your payment gateway

    // Example implementation: Assume payment is successful if the amount is greater than 0
    return amount > 0;
  }

  private void markBillAsPaid() {
    // Logic to update the bill status in the database or repository
    // Replace this with the actual implementation to update the bill status
  }
}
