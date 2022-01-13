package com.example.BankApplication.Entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
    public void amountDepositOrWithdrawal(Customer customer, double amount, String withdrawalOrDeposit){
        if (withdrawalOrDeposit.contains("deposit")){
            customer.accountBalance=customer.accountBalance+amount;
            customer.displayCustomerAccountDetails();
            System.out.println("Amount " + amount +" is credited in Account Number " +customer.accountNumber);
        }
        if (withdrawalOrDeposit.contains("withdrawal")){
            if(amount<=customer.accountBalance){
                customer.accountBalance=customer.accountBalance-amount;
                customer.displayCustomerAccountDetails();
                System.out.println("Amount " + amount +" is debited from Account Number" + customer.accountNumber);
            }
        }
    }
}