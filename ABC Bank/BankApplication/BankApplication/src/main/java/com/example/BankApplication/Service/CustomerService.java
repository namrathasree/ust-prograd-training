package com.example.BankApplication.Service;

import com.example.BankApplication.Entity.Customer;
import com.example.BankApplication.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repo;

    public Customer saveCustomer(Customer customer){
        return repo.save(customer);
    }
    public List<Customer> ListAll(){
        return repo.findAll();
    }
    public Boolean existsById(String username){
        return repo.existsById(username);
    }
    public Customer findById(String username){
        return repo.getById(username);
    }

    public Customer updateCustomer(Customer existingCustomer) {
        return repo.save(existingCustomer);
    }

    public Customer findByAccountNumber(Long accountNumber){
        return repo.findByAccountNumber(accountNumber);
    }
    public Customer findByAccountName(String customerName) {
        return repo.findByCustomerName(customerName);
    }


}
