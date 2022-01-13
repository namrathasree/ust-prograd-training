package com.example.BankApplication.Controller;
import com.example.BankApplication.Entity.Customer;
import com.example.BankApplication.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;
    Double balance;
    String name;
    @RequestMapping("/")
    public  String home(){
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String details(HttpServletRequest request,Model model){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        Customer customer;
        if(service.existsById(username)) {
            customer = service.findById(username);
            if (password.equals(customer.getPassword())) {
                model.addAttribute("customerName", customer.getCustomerName());
                model.addAttribute("username", customer.getUsername());
                model.addAttribute("mobileNumber", customer.getMobileNumber());
                model.addAttribute("address", customer.getAddress());
                model.addAttribute("accountNumber", customer.getAccountNumber());
                name = service.findById(username).getCustomerName();
                return "details";
//                model.addAttribute("balance",customer.getBalance());
            }
        }
        return "details";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/home")
    @ResponseBody
    public String registration(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String name=request.getParameter("customerName");
        String phone=request.getParameter("mobileNumber");
        Long accountNumber=Long.parseLong(request.getParameter("accountNumber"));
        String branch=request.getParameter("branch");
        String address=request.getParameter("address");
        String password=request.getParameter("password");
        Customer customer1=new Customer(username,name,phone,accountNumber,branch,address,password);
        service.saveCustomer(customer1);
        return "Registration Completed";
    }
    //update
    @RequestMapping("updateCustomer/{id}")
    public String updateCustomerDetails(@PathVariable String id,Model model){
        model.addAttribute("customer",service.findById(id));
        return "updateCustomer";
    }
    @PostMapping("/details")
    public String updateCustomer(HttpServletRequest request,Model model){
        Customer existingCustomer= service.findById(request.getParameter("username"));
        existingCustomer.setCustomerName(request.getParameter("customerName"));
        existingCustomer.setAddress(request.getParameter("address"));
        existingCustomer.setMobileNumber(request.getParameter("mobileNumber"));
        existingCustomer.setPassword(request.getParameter("password"));
        service.updateCustomer(existingCustomer);
        model.addAttribute("customerName",existingCustomer.getCustomerName());
        model.addAttribute("mobileNumber",existingCustomer.getMobileNumber());
        model.addAttribute("address",existingCustomer.getAddress());
        model.addAttribute("password",existingCustomer.getPassword());
        model.addAttribute("username", existingCustomer.getUsername());
        model.addAttribute("accountNumber", existingCustomer.getAccountNumber());
        return "details";
    }

    //deposit
    @RequestMapping("/deposit/{id}")
    public String deposit(@PathVariable String id,Model model) {
        model.addAttribute("customer",service.findById(id));
        return "deposit";
    }
    @PostMapping("/deposit")
    public String deposit(HttpServletRequest request, Model model) {
            Customer customerAccount= service.findById(request.getParameter("username"));
            Double newBalance=(customerAccount.getAccountBalance()+Double.parseDouble(request.getParameter("deposit")));
            customerAccount.setAccountBalance(newBalance);
            service.saveCustomer(customerAccount);
            model.addAttribute("successMessage", "Amount deposited!!!");
            return "deposit";
        }


        //transfer
        @RequestMapping("/transfer")
        public String transfer(HttpServletRequest request, Model model) {
            model.addAttribute("name", service.findByAccountName(name).getCustomerName());
            model.addAttribute("accountNumber", service.findByAccountName(name).getAccountNumber());
            model.addAttribute("userName", service.findByAccountName(name).getUsername());
            return "transfer";
        }

        @PostMapping("/transfer")
    public String afterTransfer(HttpServletRequest request,Model model){
        Long fromAccountNumber=Long.parseLong(request.getParameter("fromAccountNumber"));
        Long toAccountNumber=Long.parseLong(request.getParameter("toAccountNumber"));
        Double amount=Double.parseDouble(request.getParameter("amount"));

        Customer fromCustomer=service.findByAccountNumber(fromAccountNumber);
        Customer toCustomer=service.findByAccountNumber(toAccountNumber);
        if(Objects.equals(fromCustomer.getAccountNumber(),fromAccountNumber)
        && Objects.equals(toCustomer.getAccountNumber(),toAccountNumber)){

            if(fromCustomer.getAccountBalance()>amount){
                fromCustomer.setAccountBalance(fromCustomer.getAccountBalance()-amount);
                service.saveCustomer(fromCustomer);
                toCustomer.setAccountBalance(toCustomer.getAccountBalance() + amount);
                service.saveCustomer(toCustomer);
                model.addAttribute("message", "Transferred Successfully...!");
                model.addAttribute("name", fromCustomer.getCustomerName());
                model.addAttribute("balance", fromCustomer.getAccountBalance());
                model.addAttribute("userName", fromCustomer.getUsername());
            }
        }
            return "balance";
        }

    @RequestMapping("/balance")
    public String getBalanceOfAccount(Model model) {
        model.addAttribute("userName", service.findByAccountName(name).getUsername());
        model.addAttribute("name", service.findByAccountName(name).getCustomerName());
        model.addAttribute("balance", service.findByAccountName(name).getAccountBalance());
        return "balance";
    }
}

