package com.example.BankApplication.Entity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Scope("prototype")
public class Customer {
    @Id
    @Column(nullable=false,unique = true)
    String username;
    @Column(nullable=false)
    String customerName;
    @Column(nullable=false,unique = true)
    String mobileNumber;
    @Column(nullable=false)
   Long accountNumber;
    @Column(nullable=false)
    String branchName;
    Double accountBalance=0.0;
    @Column(nullable = false)
    String address;
    @Column(nullable = false)
    String password;

    public Customer(){}

    public Customer(String username, String customerName, String mobileNumber, Long accountNumber, String branchName, String address, String password) {
        this.username=username;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
        this.address = address;
        this.password = password;
    }

//    public void setCustomerAccountDetails(String customerName,String mobileNumber,String accountNumber,String branchName)
//    {
//        this.customerName=customerName;
//        this.mobileNumber=mobileNumber;
//        this.accountNumber=accountNumber;
//        this.branchName=branchName;
//    }

    public void displayCustomerAccountDetails(){
        System.out.println("****************Customer Account Details*************");
        System.out.println("Account Holder : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Branch Name : "+ branchName);
        System.out.println("Account Balance : "+accountBalance);
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance){
        this.accountBalance=accountBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}