package com.example.microservice.service;


import com.example.microservice.model.Customer;
import com.example.microservice.repository.CustomerRepository;
import com.example.microservice.request.NewCustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    public Optional<Customer> getCustomer (Long customerId) {
        return customerRepository.findById(customerId);
    }

    // why is it returning customer
    public Customer saveCustomer(NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setAge(request.getAge());

        return customerRepository.save(customer);
    }
}

