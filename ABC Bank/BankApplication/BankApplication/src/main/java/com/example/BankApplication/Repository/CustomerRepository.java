package com.example.BankApplication.Repository;

import com.example.BankApplication.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Customer findByAccountNumber(Long accountNumber);
    Customer findByCustomerName(String customerName);

}
