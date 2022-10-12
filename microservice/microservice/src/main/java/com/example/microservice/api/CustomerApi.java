package com.example.microservice.api;

import com.example.microservice.model.Customer;
import com.example.microservice.request.NewCustomerRequest;
import com.example.microservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class CustomerApi {

    private CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/customer/{customerId}")
    public Optional<Customer> getCustomer (@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody NewCustomerRequest customer) {
        return customerService.saveCustomer(customer);

    }

}
