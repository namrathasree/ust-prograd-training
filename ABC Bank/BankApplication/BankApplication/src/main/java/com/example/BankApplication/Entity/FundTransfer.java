package com.example.BankApplication.Entity;
import com.example.BankApplication.Entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class FundTransfer {
    public void fundTransferFromOneAccountToOtherAccount(double amount, Customer fromCustomer, Customer toCustomer){
        if(amount<=fromCustomer.accountBalance){
            fromCustomer.accountBalance=fromCustomer.accountBalance-amount;
            fromCustomer.displayCustomerAccountDetails();
            System.out.println("The Amount " + amount + " is transferred from Account Number " + fromCustomer.accountNumber + " to Account Number " + toCustomer.accountNumber);
            toCustomer.accountBalance=toCustomer.accountBalance+amount;
            toCustomer.displayCustomerAccountDetails();
            System.out.println("The Amount " + amount + " is transferred to Account Number " + toCustomer.accountNumber + " from Account Number " + fromCustomer.accountNumber);
        }
        else
            System.out.println("Insufficient Balance in " + fromCustomer.customerName + " Account" );
    }
}